package com.baiwang.cloud.auth.sign;

import com.baiwang.cloud.auth.sign.signature.SignatureMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonParameters extends Parameters {
    public static String PARAMETER_FORMAT = "Format";
    public static String PARAMETER_VERSION = "Version";
    public static String PARAMETER_ACCESSKEYID = "AccessKeyId";
    public static String PARAMETER_SIGNATURE = "Query";
    public static String PARAMETER_SIGNATUREMETHOD = "SignatureMethod";
    public static String PARAMETER_TIMESTAMP = "Timestamp";
    public static String PARAMETER_SIGNATUREVERSION = "SignatureVersion";
    public static String PARAMETER_SIGNATURENONCE = "SignatureNonce";

    private DataFormat format;
    private String version;
    private String accessKeyId;
    private String signature;
    private SignatureMethod signatureMethod;
    private String timestamp;
    private String signatureVersion;
    private String signatureNonce;
    private SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DDThh:mm:ssZ");

    public CommonParameters() {
    }

    public CommonParameters setFormat(DataFormat format) {
        this.format = format;
        return this;
    }

    public CommonParameters setVersion(String version) {
        this.version = version;
        return this;
    }

    public CommonParameters setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    public CommonParameters setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public CommonParameters setSignatureMethod(SignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
        return this;
    }

    public CommonParameters setTimestamp(long timestamp) {
        this.timestamp = formatter.format(new Date(timestamp));
        return this;
    }

    public CommonParameters setTimestamp(String timestamp) {
        validateTimestamp(timestamp);
        this.timestamp = timestamp;
        return this;
    }

    public CommonParameters setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
        return this;
    }

    public CommonParameters setSignatureNonce(String signatureNonce) {
        this.signatureNonce = signatureNonce;
        return this;
    }

    private void validateTimestamp(String timestamp) {
        try {
            formatter.parse(timestamp);
            this.timestamp = timestamp;
        } catch (ParseException e) {
            throw new AuthSignException(String.format("format should be like [YYYY-MM-DDThh:mm:ssZ], which is %s",
                    timestamp));
        }
    }
}
