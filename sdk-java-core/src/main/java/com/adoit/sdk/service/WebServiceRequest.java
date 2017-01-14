package com.adoit.sdk.service;

import com.adoit.sdk.auth.Credentials;
import com.adoit.sdk.auth.CredentialsProvider;

import java.util.Map;

public abstract class WebServiceRequest {

    private CredentialsProvider credentialsProvider;
    private Map<String, String> customeRequestHeaders;
    private Map<String, String> customeQueryParameters;

    public WebServiceRequest(CredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }

    public Credentials getCredentials() {
        return credentialsProvider == null ? null : credentialsProvider.getCredentials();
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }

}
