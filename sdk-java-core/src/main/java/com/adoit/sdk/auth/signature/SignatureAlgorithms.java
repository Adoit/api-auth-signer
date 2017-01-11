package com.adoit.sdk.auth.signature;

import com.baiwang.cloud.auth.Constants;

import java.security.InvalidParameterException;

public class SignatureAlgorithms {


    public static SignatureAlgorithm create(SignatureMethod signatureMethod) {
        return create(signatureMethod, Constants.Charset.UTF_8);
    }

    public static SignatureAlgorithm create(SignatureMethod signatureMethod, String encodeType) {
        if (signatureMethod == SignatureMethod.HMAC_SHA1) {
            return new HmacSha1Signature(encodeType);
        } else {
            throw new InvalidParameterException(String.format("not supported signature method: [%s]",
                    signatureMethod));
        }
    }
}
