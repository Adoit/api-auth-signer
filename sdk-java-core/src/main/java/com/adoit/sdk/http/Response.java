package com.adoit.sdk.http;

import org.apache.http.HttpResponse;

public class Response<T> {
    private T serviceResponse;
    private HttpResponse httpResponse;

    public Response(T serviceResponse, HttpResponse httpResponse) {
        this.serviceResponse = serviceResponse;
        this.httpResponse = httpResponse;
    }

    public T getServiceResponse() {
        return serviceResponse;
    }

    public HttpResponse getHttpResponse() {
        return httpResponse;
    }
}
