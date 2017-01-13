package com.adoit.sdk.http;

import com.adoit.sdk.auth.CredentialsProvider;
import com.adoit.sdk.auth.Signer;

public class ExecutionContext {
    private Signer signer;
    private CredentialsProvider credentialsProvider;

    public Signer getSigner() {
        return signer;
    }

    public void setSigner(Signer signer) {
        this.signer = signer;
    }

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.credentialsProvider = credentialsProvider;
    }
}
