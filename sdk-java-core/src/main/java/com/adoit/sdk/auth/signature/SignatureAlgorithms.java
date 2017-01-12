package com.adoit.sdk.auth.signature;

import com.adoit.sdk.common.StringUtils;

import java.security.InvalidParameterException;

public class SignatureAlgorithms {


    public static SignatureAlgorithm create(SignatureMethod signatureMethod) {
        return create(signatureMethod, StringUtils.DEFAULT_ENCODING);
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
