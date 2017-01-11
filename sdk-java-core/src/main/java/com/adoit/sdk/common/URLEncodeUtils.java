package com.adoit.sdk.common;

import com.adoit.sdk.ClientException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class URLEncodeUtils {
    public static final char QUERY_PARAMETER_SEPARATOR = '&';
    public static final String NAME_VALUE_SEPARATOR = "=";

    public static String format(final List<? extends NameValuePair> parameters,
                                final String encoding) {
        return format(parameters, QUERY_PARAMETER_SEPARATOR, encoding);
    }

    public static String format(final List<? extends NameValuePair> parameters,
                                final char parameterSeparator,
                                final String encoding) {
        final StringBuilder result = new StringBuilder();
        final Set<NameValuePair> sortedParameters =
                new TreeSet<NameValuePair>(new Comparator<NameValuePair>() {
                    public int compare(NameValuePair o1, NameValuePair o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
        sortedParameters.addAll(parameters);
        for (final NameValuePair parameter : sortedParameters) {
            final String encodedName = encode(parameter.getName(), encoding);
            final String encodedValue = encode(parameter.getValue(), encoding);
            if (result.length() > 0) {
                result.append(parameterSeparator);
            }
            result.append(encodedName);
            if (encodedValue != null) {
                result.append(NAME_VALUE_SEPARATOR);
                result.append(encodedValue);
            }
        }
        return result.toString();
    }

    public static String encode(String content, String encoding) {
        Preconditions.checkNotNull(content, "content");
        Preconditions.checkNotNull(encoding, "encoding");

        try {
            return URLEncoder.encode(content, encoding)
                    .replace("+", "%20")
                    .replace("*", "%2A")
                    .replace("%7E", "~");

        } catch (UnsupportedEncodingException e) {
            throw new ClientException(String.format("not supported encoding: [%s]", encoding), e);
        }
    }
}
