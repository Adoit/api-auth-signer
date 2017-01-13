package com.adoit.sdk.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class HttpResponse {

    private String statusText;
    private int statusCode;
    private InputStream content;
    private Map<String, String> headers = new HashMap<String, String>();

}
