package com.baiwang.cloud.auth.sign.encode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DefaultEncoder extends Encoder {
    private String encoding;

    public DefaultEncoder(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public String encode(String value) throws UnsupportedEncodingException {
        return value != null ?
                URLEncoder.encode(value, encoding)
                        .replace("+", "%20")
                        .replace("*", "%2A")
                        .replace("%7E", "~")
                : null;
    }
}
