package com.adoit.sdk;

public interface ResponseHandler<T> {
    void handle(Response<T> response);
}
