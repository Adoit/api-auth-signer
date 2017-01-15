package com.adoit.sdk.http;

import com.adoit.sdk.ClientConfiguration;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class HttpClientFactory {
    private HttpClientConnectionManagerFactory cmFactory = new HttpClientConnectionManagerFactory();

    public HttpClient create(ClientConfiguration configuration) {
        HttpClientBuilder builder = HttpClients.custom();
        HttpClientConnectionManager cm = cmFactory.create(configuration);
        return builder.build();
    }
}
