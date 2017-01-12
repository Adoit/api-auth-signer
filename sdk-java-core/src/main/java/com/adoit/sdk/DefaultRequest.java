package com.adoit.sdk;

import com.adoit.sdk.http.HttpMethod;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class DefaultRequest<T> implements Request<T> {

    public void addHeader(String name, String value) {

    }

    public void addParameter(String name, List<String> value) {

    }

    public void setContent(InputStream content) {

    }

    public void setHeaders(Map<String, String> headers) {

    }

    public void setParameters(Map<String, String> parameters) {

    }

    public void setResourcePath(String resourcePath) {

    }

    public void setEndpoint(URI endpoint) {

    }

    public void setHttpMethod(HttpMethod httpmethod) {

    }

    public Request<T> withParameter(String name, String value) {
        return null;
    }

    public URI getEndpoint() {
        return null;
    }

    public String getResourcePath() {
        return null;
    }

    public Map<String, String> getHeaders() {
        return null;
    }

    public Map<String, List<String>> getParameters() {
        return null;
    }

    public HttpMethod getHttpMethod() {
        return null;
    }

    public InputStream getContent() {
        return null;
    }

    public String getServiceName() {
        return null;
    }
}
