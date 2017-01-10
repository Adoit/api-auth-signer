package com.baiwang.cloud.auth.sign.encode;

import java.io.UnsupportedEncodingException;

public abstract class Encoder {
    public abstract String encode(String data) throws UnsupportedEncodingException;

    public static Encoder getInstance(String encoding) {
        return new DefaultEncoder(encoding);
    }
}
