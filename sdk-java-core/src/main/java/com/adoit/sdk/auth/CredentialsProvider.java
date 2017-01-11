package com.adoit.sdk.auth;

public interface CredentialsProvider {
    Credentials getCredentials();

    void refresh();
}
