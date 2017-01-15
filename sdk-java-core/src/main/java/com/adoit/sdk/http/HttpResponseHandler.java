package com.adoit.sdk.http;

public interface HttpResponseHandler<T> {
    T handle(HttpResponse response);
}
