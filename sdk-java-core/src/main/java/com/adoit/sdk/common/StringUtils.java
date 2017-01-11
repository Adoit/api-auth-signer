package com.adoit.sdk.common;

public class StringUtils {
    public static String DEFAULT_ENCODING = "UTF-8";

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public static String upperCase(String value) {
        return isNullOrEmpty(value) ? value : value.toUpperCase();
    }

    public static String lowerCase(String value) {
        return isNullOrEmpty(value) ? value : value.toLowerCase();
    }
}
