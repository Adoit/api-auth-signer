package com.baiwang.cloud.auth.sign.signature;

import com.baiwang.cloud.auth.sign.AuthSignException;
import com.baiwang.cloud.auth.sign.Constants;

import org.apache.commons.codec.binary.Base64;

import java.net.URLEncoder;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.crypto.dsig.SignatureMethod;

public class HmacSha1Signature implements SignatureAlgorithm {

    private static String ALGORITHM = "HmacSha1";
    private String encodeType;

    public HmacSha1Signature() {
        this.encodeType = Constants.Charset.UTF_8;
    }

    public HmacSha1Signature(String encodeType) {
        this.encodeType = encodeType;
    }

    public String sign(String key, String dataToSign) {
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), SignatureMethod.HMAC_SHA1);
        try {
            Mac mac = Mac.getInstance(ALGORITHM);
            mac.init(secretKey);
            return URLEncoder.encode(
                    new String(new Base64().encode(mac.doFinal(dataToSign.getBytes(encodeType))), encodeType),
                    encodeType);
        } catch (Exception e) {
            throw new AuthSignException(e);
        }
    }

    public String getName() {
        return ALGORITHM;
    }
}
