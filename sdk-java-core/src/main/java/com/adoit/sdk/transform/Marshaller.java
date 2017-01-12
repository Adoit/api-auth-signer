package com.adoit.sdk.transform;

public interface Marshaller<T, R> {
    T marshall(R in);
}
