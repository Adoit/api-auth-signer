package com.adoit.sdk;

import com.adoit.sdk.common.Preconditions;

import java.util.Map;

public class ResponseMetadata {
    public static final String REQUEST_ID = "requestId";

    private Map<String, String> metadata;

    public ResponseMetadata(Map<String, String> metadata) {
        this.metadata = Preconditions.checkNotNull(metadata);
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public String getRequestId() {
        return metadata.get(REQUEST_ID);
    }
}
