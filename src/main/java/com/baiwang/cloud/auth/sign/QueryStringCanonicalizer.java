package com.baiwang.cloud.auth.sign;

import com.baiwang.cloud.auth.sign.encode.Encoder;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;

public class QueryStringCanonicalizer {

    private String resource;
    private String encoding;
    private Map<String, Object> parameterValues = new TreeMap<String, Object>();

    public QueryStringCanonicalizer(String encoding) {
        this("", encoding);
    }

    public QueryStringCanonicalizer(String resource, String encoding) {
        this.resource = resource;
        this.encoding = encoding;
    }

    public QueryStringCanonicalizer addParameter(String name, String value) {
        parameterValues.put(name, value);
        return this;
    }

    public QueryStringCanonicalizer addParameters(Map<String, Object> parameterValues) {
        parameterValues.putAll(parameterValues);
        return this;
    }

    public String getResource() {
        return resource;
    }

    public Map<String, Object> getParameterValues() {
        return parameterValues;
    }

    public String canonicalize() {
        Encoder encoder = Encoder.getInstance(encoding);
        StringBuffer sb = new StringBuffer(resource);
        sb.append(Constants.Query.PARAMETER_SEPARATOR);
        for (Map.Entry<String, Object> entry : parameterValues.entrySet()) {
            try {
                sb.append(encoder.encode(entry.getKey()))
                        .append(Constants.Query.PARAMETER_VALUE_SEPARATOR)
                        .append(encoder.encode(entry.getValue().toString()));
            } catch (UnsupportedEncodingException e) {
                throw new AuthSignException(String.format("unsupported encoding [%s]", encoding), e);
            }
        }
        return null;
    }
}
