package com.adoit.sdk.transform;

public interface Marshaller<Output, Input> {
    Output marshall(Input in);
}
