package com.adoit.sdk;

import com.adoit.sdk.http.ExecutionContext;
import com.adoit.sdk.http.HttpResponse;
import com.adoit.sdk.http.HttpResponseHandler;
import com.adoit.sdk.retry.RetryPolicy;
import com.adoit.sdk.service.WebServiceRequest;
import com.adoit.sdk.service.WebServiceResponse;
import com.adoit.sdk.transform.NotImplementedException;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;

import java.io.IOException;

public class WebServiceClient {
    private ClientConfiguration clientConfiguration;
    private RetryPolicy retryPolicy;
    private HttpClient httpClient;

    public WebServiceClient(ClientConfiguration clientConfiguration, RetryPolicy retryPolicy) {
        this.clientConfiguration = clientConfiguration;
        this.retryPolicy = retryPolicy;
    }

    public <O extends WebServiceResponse, I extends WebServiceRequest> Response<O> execute(Request<I> request,
                                                                                           HttpResponseHandler<O>
                                                                                                   httpResponseHandler,
                                                                                           ExecutionContext
                                                                                                   executionContext)
            throws IOException {
        org.apache.http.HttpResponse innerResponse = httpClient.execute(newInnerHttpRequest(request));
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.setContent(innerResponse.getEntity().getContent());
        httpResponse.setStatusCode(innerResponse.getStatusLine().getStatusCode());
        httpResponse.setStatusText(innerResponse.getStatusLine().getReasonPhrase());
        for (Header header : innerResponse.getAllHeaders()) {
            httpResponse.addHeader(header.getName(), header.getValue());
        }

        O response = httpResponseHandler.handle(httpResponse);
        return new Response<O>(response, httpResponse);
    }

    private HttpRequestBase newInnerHttpRequest(Request<?> request) {
        throw new NotImplementedException();
    }

}
