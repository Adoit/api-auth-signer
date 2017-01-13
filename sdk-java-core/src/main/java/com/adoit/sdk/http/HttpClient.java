package com.adoit.sdk.http;

import com.adoit.sdk.ClientConfiguration;
import com.adoit.sdk.Request;
import com.adoit.sdk.Response;
import com.adoit.sdk.retry.RetryPolicy;

public class HttpClient {
    private ClientConfiguration clientConfiguration;
    private RetryPolicy retryPolicy;

    public HttpClient(ClientConfiguration clientConfiguration, RetryPolicy retryPolicy) {
        this.clientConfiguration = clientConfiguration;
        this.retryPolicy = retryPolicy;
    }

    public <Output, Input> Response<Output> execute(Request<Input> request,
                                                    ExecutionContext executionContext) {
        return null;
    }
}
