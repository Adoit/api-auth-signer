package com.adoit.sdk.http;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

public interface HttpRequest extends ImmutableRequest {

    void addHeader(String name, String value);

    void addParameters(String name, List<String> values);

    void addParameter(String name, String value);

    void setContent(InputStream content);

    void setHeaders(Map<String, String> headers);

    void setParameters(Map<String, List<String>> parameters);

    void setResourcePath(String resourcePath);

    void setEndpoint(URI endpoint);

    void setHttpMethod(HttpMethod httpmethod);

    HttpRequest withParameter(String name, String value);
}
