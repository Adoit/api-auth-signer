package com.adoit.sdk.handlers;

import com.adoit.sdk.http.HttpResponse;
import com.adoit.sdk.http.HttpResponseHandler;
import com.adoit.sdk.service.WebServiceResponse;
import com.adoit.sdk.transform.UnMarshaller;

public class XmlResponseHandler<T extends WebServiceResponse> implements HttpResponseHandler<T> {

    private UnMarshaller<T, String> unMarshaller;

    public XmlResponseHandler(UnMarshaller<T, String> unMarshaller) {
        this.unMarshaller = unMarshaller;
    }

    public T handle(HttpResponse response) {
        return null;
    }
}
