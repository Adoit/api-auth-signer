package com.adoit.sdk.auth.signature;

import com.adoit.sdk.common.StringUtils;
import com.adoit.sdk.common.URLEncodeUtils;
import com.adoit.sdk.http.HttpMethod;

import java.util.Date;

public class SignatureBuilder {

    private char queryParameterSeparator;
    private HttpMethod httpMethod;
    private String canonicalizedQueryString;
    private SignatureMethod signatureMethod;
    private String encoding = StringUtils.DEFAULT_ENCODING;
    private String secret;
    private Date expiration;

    public SignatureBuilder() {
        this(URLEncodeUtils.QUERY_PARAMETER_SEPARATOR);
    }

    public SignatureBuilder(char queryParameterSeparator) {
        this.queryParameterSeparator = queryParameterSeparator;
    }

    public SignatureBuilder setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    public SignatureBuilder setCanonicalizedQueryString(String canonicalizedQueryString) {
        this.canonicalizedQueryString = canonicalizedQueryString;
        return this;
    }

    public SignatureBuilder setSignatureMethod(SignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
        return this;
    }

    public SignatureBuilder setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public SignatureBuilder setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public SignatureBuilder setExpiration(Date expiration) {
        this.expiration = expiration;
        return this;
    }

    public String build() {
        SignatureAlgorithm sa = SignatureAlgorithms.create(signatureMethod, encoding);
        StringBuilder sb = new StringBuilder()
                .append(httpMethod.toString())
                .append(queryParameterSeparator)
                .append(URLEncodeUtils.encode("/", encoding))
                .append(queryParameterSeparator)
                .append(URLEncodeUtils.encode(canonicalizedQueryString, encoding));

        return sa.sign(secret, sb.toString());

    }
}
