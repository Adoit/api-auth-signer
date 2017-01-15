package com.adoit.sdk.transform;

public interface UnMarshaller<O, I> {
    O unMarshall(I in);
}
