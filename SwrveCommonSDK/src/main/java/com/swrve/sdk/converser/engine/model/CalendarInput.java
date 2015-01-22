package com.swrve.sdk.converser.engine.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarInput extends InputBase {
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private String description;
    private String start;
    private String end;

    public String getDescription() {
        return description;
    }

    public Date getStart() {
        if (start == null) {
            return null;
        }
        try {
            return sdf.parse(start);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date getEnd() {
        if (end == null) {
            return null;
        }

        try {
            return sdf.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
