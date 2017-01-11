package com.adoit.sdk.auth;

import com.adoit.sdk.common.NameValuePair;
import com.adoit.sdk.common.URLEncodeUtils;

import java.util.ArrayList;
import java.util.List;

public class QueryStringCanonicalizer {

    private String resource;
    private String encoding;
    private List<NameValuePair> parameterValues = new ArrayList<NameValuePair>();

    public QueryStringCanonicalizer(String encoding) {
        this("", encoding);
    }

    public QueryStringCanonicalizer(String resource, String encoding) {
        this.resource = resource;
        this.encoding = encoding;
    }

    public QueryStringCanonicalizer addParameter(NameValuePair parameter) {
        parameterValues.add(parameter);
        return this;
    }

    public QueryStringCanonicalizer addParameters(List<? extends NameValuePair> parameters) {
        parameterValues.addAll(parameterValues);
        return this;
    }

    public String getResource() {
        return resource;
    }

    public List<NameValuePair> getParameterValues() {
        return parameterValues;
    }

    public String canonicalize() {
        return new StringBuilder(resource)
                .append(URLEncodeUtils.QUERY_PARAMETER_SEPARATOR)
                .append(URLEncodeUtils.format(parameterValues, encoding)).toString();
    }
}
