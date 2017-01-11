package com.adoit.sdk.auth.signature;

public interface SignatureAlgorithm {
    String sign(String key, String data);

    String getName();
}
