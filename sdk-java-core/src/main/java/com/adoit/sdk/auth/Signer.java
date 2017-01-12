package com.adoit.sdk.auth;

import com.adoit.sdk.Request;

public interface Signer {
    void sign(Request<?> request, Credentials credentials);
}
