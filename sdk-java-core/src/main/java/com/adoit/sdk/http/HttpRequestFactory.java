package com.adoit.sdk.http;

import com.adoit.sdk.Request;

public interface HttpRequestFactory<T> {
    T create(Request<?> request);
}
