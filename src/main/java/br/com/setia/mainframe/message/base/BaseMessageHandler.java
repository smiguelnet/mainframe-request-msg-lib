package br.com.setia.mainframe.message.base;

import br.com.setia.mainframe.message.spec.SetiaMessageField;
import br.com.setia.mainframe.message.spec.SetiaMessageFieldAttr;
import br.com.setia.mainframe.message.util.Util;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Base Request Handler
 *
 * @author Setia Tecnologia
 */
public abstract class BaseMessageHandler {

    public <T> T getMessageResponse(String response, Class<T> type) throws IllegalAccessException, InstantiationException {

        if (Util.isNullOrEmpty(response))
            return null;

        T setiaMessageResponse = type.newInstance();
        Field[] fields = setiaMessageResponse.getClass().getDeclaredFields();
        List<SetiaMessageField> setiaFieldsList = new ArrayList<SetiaMessageField>();

        for (Field field : fields) {
            field.setAccessible(true);
            setiaFieldsList.add(new SetiaMessageField(field,
                    field.getAnnotation(SetiaMessageFieldAttr.class).order(),
                    field.getAnnotation(SetiaMessageFieldAttr.class).size()));
        }
        Collections.sort(setiaFieldsList);

        int pos = 0;
        for (SetiaMessageField setiaMessageField : setiaFieldsList) {
            setiaMessageField.getField().set(setiaMessageResponse, getValueFromString(response, pos, setiaMessageField.getSize()));
            pos += setiaMessageField.getSize();
        }

        setiaFieldsList = new ArrayList<SetiaMessageField>();
        Field[] fieldsSuperClass = setiaMessageResponse.getClass().getSuperclass().getDeclaredFields();

        for (Field field : fieldsSuperClass) {
            field.setAccessible(true);
            setiaFieldsList.add(new SetiaMessageField(field,
                    field.getAnnotation(SetiaMessageFieldAttr.class).order(),
                    field.getAnnotation(SetiaMessageFieldAttr.class).size()));
        }
        Collections.sort(setiaFieldsList);

        for (SetiaMessageField setiaMessageField : setiaFieldsList) {
            setiaMessageField.getField().set(setiaMessageResponse, getValueFromString(response, pos, setiaMessageField.getSize()));
            pos += setiaMessageField.getSize();
        }
        return setiaMessageResponse;
    }

    protected String getValueFromString(String value, int pos, int length) {
        if (Util.isNullOrEmpty(value))
            return null;

        if (value.length() < (pos + length))
            return null;

        String fieldValue = value.substring(pos, (pos + length));
        if (Util.isNullOrEmpty(fieldValue))
            return null;

        return fieldValue.trim();
    }

    protected String prepareFieldWithMetada(Class<?> clazz, String fieldValue, String value) throws NoSuchFieldException, SecurityException {
        Field field = clazz.getDeclaredField(fieldValue);
        field.setAccessible(true);

        String returnValue;
        SetiaMessageFieldAttr setiaMessageField = field.getAnnotation(SetiaMessageFieldAttr.class);

        if (!Util.isNullOrEmpty(value)) {
            returnValue = value;
        } else {
            returnValue = setiaMessageField.defaultValue();
        }

        if (returnValue.length() > setiaMessageField.size()) {
            returnValue = returnValue.substring(0, setiaMessageField.size());
        }
        returnValue = Util.prepareStringToMainframe(returnValue);

        if (returnValue.length() < setiaMessageField.size()) {
            if (SetiaMessageFieldAttr.SetiaMessageFieldType.NUMERIC.equals(setiaMessageField.type())) {
                returnValue = StringUtils.leftPad(returnValue, setiaMessageField.size(), setiaMessageField.completeWith());
            } else {
                returnValue = StringUtils.rightPad(returnValue, setiaMessageField.size(), setiaMessageField.completeWith());
            }
        }
        return returnValue;
    }
}
