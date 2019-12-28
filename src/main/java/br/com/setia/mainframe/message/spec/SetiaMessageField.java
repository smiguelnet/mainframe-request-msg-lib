package br.com.setia.mainframe.message.spec;

import java.lang.reflect.Field;

/**
 * Message field definition
 *
 * @author Setia Tecnologia
 */
public class SetiaMessageField implements Comparable<SetiaMessageField> {
    private Field field;
    private int order;
    private int size;

    public SetiaMessageField(Field field, int order, int size) {
        super();
        this.field = field;
        this.order = order;
        this.size = size;
    }

    public int compareTo(SetiaMessageField o) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if (o == null)
            return EQUAL;

        return o.getOrder() > this.getOrder() ? BEFORE : AFTER;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
