package com.baiwang.cloud.auth.sign;

import java.util.HashMap;
import java.util.Map;

public class Parameters {
    private Map<String, Object> values = new HashMap<String, Object>();

    public Map<String, Object> getValues() {
        return values;
    }

    public Map<String, Object> addParameter(String parameterName, Object parameterValue) {
        this.values.put(parameterName, parameterValue);
        return this.values;
    }

    public Map<String, Object> addParameters(Map<String, Object> parameterValues) {
        this.values.putAll(parameterValues);
        return this.values;
    }

    public Object getValue(String parameterName) {
        return this.values.get(parameterName);
    }

}
