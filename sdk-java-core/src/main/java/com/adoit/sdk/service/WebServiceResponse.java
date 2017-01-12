package com.adoit.sdk.service;

import com.adoit.sdk.ResponseMetadata;

public class WebServiceResponse<T> {
    private T result;
    private ResponseMetadata responseMetadata;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public String getRequestId() {
        return responseMetadata == null ? null : responseMetadata.getRequestId();
    }
}
