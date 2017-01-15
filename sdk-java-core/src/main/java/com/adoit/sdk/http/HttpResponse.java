package com.adoit.sdk.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class HttpResponse {

    private String statusText;
    private int statusCode;
    private InputStream content;
    private Map<String, String> headers = new HashMap<String, String>();

    public HttpResponse() {
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public InputStream getContent() {
        return content;
    }

    public void setContent(InputStream content) {
        this.content = content;
    }

    public void addHeader(String name, String value) {
        headers.put(name, value);
    }
}
