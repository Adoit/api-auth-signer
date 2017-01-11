package com.adoit.sdk.http;

import com.adoit.sdk.common.StringUtils;

import java.security.InvalidParameterException;

public enum HttpMethod {
    GET, POST, HEAD, OPTIONS, PUT, PATCH, DELETE, TRACE;

    public static HttpMethod fromValue(String value) {
        if (StringUtils.isNullOrEmpty(value)) {
            throw new InvalidParameterException("value is null");
        }

        for (HttpMethod httpMethod : values()) {
            if (httpMethod.name().equalsIgnoreCase(value)) {
                return httpMethod;
            }
        }

        throw new InvalidParameterException(String.format("invalid http method: [%s]", value));
    }
}
