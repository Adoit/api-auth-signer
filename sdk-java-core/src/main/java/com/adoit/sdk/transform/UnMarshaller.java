package com.adoit.sdk.transform;

public interface UnMarshaller<Output, Input> {
    Output unMarshall(Input in);
}
