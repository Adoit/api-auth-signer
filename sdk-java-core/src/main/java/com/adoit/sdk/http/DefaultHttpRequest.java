package com.adoit.sdk.http;

import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DefaultHttpRequest implements HttpRequest {

    private String resourcePath;
    private Map<String, String> headers = new HashMap<String, String>();
    private Map<String, List<String>> parameters = new LinkedHashMap<String, List<String>>();
    private URI endpoint;
    private HttpMethod httpMethod;
    private InputStream content;
    private String serviceName;

    public DefaultHttpRequest(String serviceName) {
        this.serviceName = serviceName;
    }

    public void addHeader(String name, String value) {
        this.headers.put(name, value);
    }

    public void addParameters(String name, List<String> values) {
        if (values != null) {
            for (String value : values) {
                addParameter(name, value);
            }
        }
    }

    public void addParameter(String name, String value) {
        List<String> paramValues = this.parameters.get(name);
        if (paramValues == null) {
            paramValues = new ArrayList<String>();
            this.parameters.put(name, paramValues);
        }
        paramValues.add(value);
    }

    public void setContent(InputStream content) {
        this.content = content;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers.clear();
        this.headers.putAll(headers);
    }

    public void setParameters(Map<String, List<String>> parameters) {
        this.parameters.clear();
        this.parameters.putAll(parameters);
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    public void setHttpMethod(HttpMethod httpmethod) {
        this.httpMethod = httpmethod;
    }

    public HttpRequest withParameter(String name, String value) {
        this.addParameter(name, value);
        return this;
    }

    public URI getEndpoint() {
        return this.endpoint;
    }

    public String getResourcePath() {
        return this.resourcePath;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Map<String, List<String>> getParameters() {
        return this.parameters;
    }

    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public InputStream getContent() {
        return this.content;
    }

    public String getServiceName() {
        return this.serviceName;
    }
}
