package com.wangl.utils;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JsonDateValueProcessorUtil implements JsonValueProcessor {
    public static final String Default_DATE_PATTERN = "yyyy-MM-dd";
    private DateFormat dateFormat;

    public JsonDateValueProcessorUtil(String datePattern) {
        try {
            dateFormat = new SimpleDateFormat(datePattern);
        }catch (Exception e) {
            dateFormat = new SimpleDateFormat(Default_DATE_PATTERN);
        }

    }

    @Override
    public Object processArrayValue(Object value, JsonConfig jsonConfig) {
        return process(value);
    }

    @Override
    public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
        return process(value);
    }

    private Object process(Object value) {
        if (value == null) {
            return "";
        } else {
            return dateFormat.format((Timestamp) value);
        }
    }
}
