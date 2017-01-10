package com.baiwang.cloud.auth.sign.signature;

public interface SignatureAlgorithm {
    String sign(String key, String data);

    String getName();
}
