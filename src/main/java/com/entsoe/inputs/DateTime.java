package com.entsoe.inputs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime implements Param {

    private final LocalDateTime localDateTime;
    private final DateTimeParamName paramName;
    private final DateTimeFormatter timeFormatter;

    public DateTime(LocalDateTime localDateTime, DateTimeParamName paramName){
        this.timeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        this.localDateTime = localDateTime;
        this.localDateTime.format(timeFormatter);
        this.paramName = paramName;
    }


    @Override
    public String getParamValue() {
        return this.localDateTime.format(timeFormatter);
    }

    @Override
    public String getParamName() {
        return this.paramName.paramName;
    }

    public enum DateTimeParamName{
        PERIOD_START("periodStart"),
        PERIOD_END("periodEnd");

        private final String paramName;

        DateTimeParamName(String paramName) {
            this.paramName = paramName;
        }
    }
}
