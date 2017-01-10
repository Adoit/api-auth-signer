package com.baiwang.cloud.auth.sign.signature;

import com.baiwang.cloud.auth.sign.AuthSignException;
import com.baiwang.cloud.auth.sign.Constants;
import com.baiwang.cloud.auth.sign.encode.Encoder;
import com.baiwang.cloud.auth.sign.http.HttpMethod;

import java.io.UnsupportedEncodingException;

public class SignatureBuilder {

    private String parameterSeparator;
    private HttpMethod httpMethod;
    private String canonicalizedQueryString;
    private SignatureMethod signatureMethod;
    private String encoding = Constants.Charset.UTF_8;
    private String secret;

    public SignatureBuilder() {
        this(Constants.Query.PARAMETER_SEPARATOR);
    }

    public SignatureBuilder(String parameterSeparator) {
        this.parameterSeparator = parameterSeparator;
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

    public String build() {
        SignatureAlgorithm sa = SignatureAlgorithms.create(signatureMethod, encoding);
        Encoder encoder = Encoder.getInstance(encoding);
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(httpMethod.toString())
                    .append(parameterSeparator)
                    .append(encoder.encode("/"))
                    .append(parameterSeparator)
                    .append(encoder.encode(canonicalizedQueryString));

            return sa.sign(secret, sb.toString());
        } catch (UnsupportedEncodingException e) {
            throw new AuthSignException("not supported encoding", e);
        }

    }
}
