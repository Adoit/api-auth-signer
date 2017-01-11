package com.adoit.sdk.service;

import com.adoit.sdk.auth.Credentials;
import com.adoit.sdk.auth.CredentialsProvider;

public class WebServiceRequest {

    private CredentialsProvider credentialsProvider;

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
