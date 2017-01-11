package com.adoit.sdk.common;

public class BasicNameValuePair implements NameValuePair {

    private String name;
    private String value;

    private BasicNameValuePair(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static BasicNameValuePair of(String name, String value) {
        return new BasicNameValuePair(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
