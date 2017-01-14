package com.adoit.sdk.transform;

public interface Marshaller<O, I> {
    O marshall(I in);
}
