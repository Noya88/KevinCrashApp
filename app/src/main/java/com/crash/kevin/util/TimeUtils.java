package com.crash.kevin.util;

/**
 * Created by hades on 2016/5/4.
 */
import android.text.format.DateUtils;
import java.util.Date;

import static android.text.format.DateUtils.FORMAT_NUMERIC_DATE;
import static android.text.format.DateUtils.FORMAT_SHOW_DATE;
import static android.text.format.DateUtils.FORMAT_SHOW_YEAR;
import static android.text.format.DateUtils.MINUTE_IN_MILLIS;

/**
 * Utilities for dealing with dates and times
 */
public class TimeUtils {

    public static CharSequence getRelativeTime(final Date date) {
        long now = System.currentTimeMillis();
        if (Math.abs(now - date.getTime()) > 60000) {
            return DateUtils.getRelativeTimeSpanString(date.getTime(), now,
                    MINUTE_IN_MILLIS, FORMAT_SHOW_DATE | FORMAT_SHOW_YEAR
                            | FORMAT_NUMERIC_DATE);
        } else {
            return "just now";
        }

    }

//    public static CharSequence getRelativeTime(final String date) {
//        return getRelativeTime(stringToDate(date));
//    }
//
//    public static Date stringToDate(String value){
//        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
//        DateTime t = format.parseDateTime(value);
//        return t.toDate();
//    }
//
//    public static String dateToString(Date value){
//        DateTimeFormatter formats = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
//        return formats.print(value.getTime());
//    }
}