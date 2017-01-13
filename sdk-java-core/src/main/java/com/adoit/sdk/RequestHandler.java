package com.adoit.sdk;

public interface RequestHandler<T> {
    void handle(Request<T> request);
}
