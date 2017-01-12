package com.adoit.sdk.transform;

public interface UnMarshaller<T, R> {
    T unMarshall(R in);
}
