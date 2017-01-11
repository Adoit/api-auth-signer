package com.adoit.sdk.http;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

public interface ImmutableRequest<T> {

    URI getEndpoint();

    String getResourcePath();

    Map<String, String> getHeaders();

    Map<String, List<String>> getParameters();

    HttpMethod getHttpMethod();

    InputStream getContent();

    String getServiceName();
}
