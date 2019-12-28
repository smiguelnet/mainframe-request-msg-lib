package br.com.setia.mainframe.message.util;

import org.apache.commons.lang3.StringUtils;

import java.text.Normalizer;

public class Util {
    public static boolean isNullOrEmpty(String value) {
        return StringUtils.isEmpty(value);
    }

    public static String prepareStringToMainframe(String value) {
        if (value == null)
            return null;
        try {
            return removeAccentChars(value).toUpperCase();

        } catch (Exception e) {
            //This print is only for demonstration purpose
            e.printStackTrace();
            return value;
        }
    }

    public static String removeAccentChars(String value) {
        String text = Normalizer.normalize(value, Normalizer.Form.NFD);
        text = text.replaceAll("[^\\p{ASCII}]", "");
        return text;
    }
}
