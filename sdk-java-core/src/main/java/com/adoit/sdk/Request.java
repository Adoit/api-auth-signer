package com.adoit.sdk;

import com.adoit.sdk.http.HttpMethod;
import com.adoit.sdk.http.ImmutableRequest;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

public interface Request<T> extends ImmutableRequest<T> {

    void addHeader(String name, String value);

    void addParameter(String name, List<String> value);

    void setContent(InputStream content);

    void setHeaders(Map<String, String> headers);

    void setParameters(Map<String, String> parameters);

    void setResourcePath(String resourcePath);

    void setEndpoint(URI endpoint);

    void setHttpMethod(HttpMethod httpmethod);

    Request<T> withParameter(String name, String value);
}
