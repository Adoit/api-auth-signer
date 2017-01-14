package com.adoit.sdk;

import com.adoit.sdk.http.HttpRequest;

public class Request<T> {
    private T serviceRequest;
    private HttpRequest httpRequest;

    public T getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(T serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }
}
