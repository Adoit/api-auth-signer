package com.adoit.sdk.common;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.tz.FixedDateTimeZone;

import java.util.Date;

public class DateUtils {
    private static final DateTimeZone GMT = new FixedDateTimeZone("GMT", "GMT", 0, 0);
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormat.forPattern("YYYY-MM-DDThh:mm:ssZ").withZone(GMT);

    public static Date parse(String dateString) {
        return FORMATTER.parseDateTime(dateString).toDate();
    }

}
