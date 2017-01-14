package com.adoit.sdk;

import com.adoit.sdk.http.ExecutionContext;
import com.adoit.sdk.http.HttpClient;
import com.adoit.sdk.service.WebServiceRequest;
import com.adoit.sdk.service.WebServiceResponse;

public class WebServiceClient {
    private HttpClient httpClient;

    public <I extends WebServiceRequest, O extends WebServiceResponse> O doInvoke(
            I webServiceRequest,
            ResponseHandler<O> responseHandler,
            ExecutionContext executionContext) {
        return null;
    }
}
