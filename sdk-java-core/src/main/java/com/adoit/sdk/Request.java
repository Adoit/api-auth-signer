package com.adoit.sdk;

import com.adoit.sdk.http.DefaultHttpRequest;
import com.adoit.sdk.http.HttpMethod;
import com.adoit.sdk.http.HttpRequest;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class Request<T> {
    private T serviceRequest;
    private HttpRequest httpRequest;

    public Request(String serviceName, T serviceRequest) {
        this(serviceRequest, new DefaultHttpRequest(serviceName));
    }

    public Request(T serviceRequest, HttpRequest httpRequest) {
        this.serviceRequest = serviceRequest;
        this.httpRequest = httpRequest;
    }

    public T getServiceRequest() {
        return serviceRequest;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void addHeader(String name, String value) {
        this.httpRequest.addHeader(name, value);
    }

    public void addParameter(String name, String value) {
        this.httpRequest.addParameter(name, value);
    }

    public void setContent(InputStream content) {
        this.httpRequest.setContent(content);
    }

    public void setParameters(Map<String, List<String>> parameters) {
        this.httpRequest.setParameters(parameters);
    }

    public void setResourcePath(String resourcePath) {
        this.httpRequest.setResourcePath(resourcePath);
    }

    public void setEndpoint(URI endpoint) {
        this.httpRequest.setEndpoint(endpoint);
    }

    public void setHttpMethod(HttpMethod httpmethod) {
        this.httpRequest.setHttpMethod(httpmethod);
    }

    public Request<T> withParameter(String name, String value) {
        this.addParameter(name, value);
        return this;
    }

    public URI getEndpoint() {
        return this.httpRequest.getEndpoint();
    }

    public String getResourcePath() {
        return this.httpRequest.getResourcePath();
    }

    public Map<String, String> getHeaders() {
        return this.httpRequest.getHeaders();
    }

    public Map<String, List<String>> getParameters() {
        return this.httpRequest.getParameters();
    }

    public HttpMethod getHttpMethod() {
        return this.httpRequest.getHttpMethod();
    }

    public InputStream getContent() {
        return this.httpRequest.getContent();
    }

    public String getServiceName() {
        return this.httpRequest.getServiceName();
    }
}
