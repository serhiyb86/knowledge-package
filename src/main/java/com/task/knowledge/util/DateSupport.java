package com.task.knowledge.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

public class DateSupport {

    private static final String KPAC_PATTERN = "dd-MM-yyyy";
    private static final String MYSQL_PATTERN = "yyyy-MM-dd";

    public static Date toDateMysqlFormat(String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(KPAC_PATTERN));
        localDate.format(DateTimeFormatter.ofPattern(MYSQL_PATTERN));
        return Date.valueOf(localDate);
    }

    public static String fromDateMysqlFormat(Date date) {
        LocalDate mysqlDate = LocalDate.parse(date.toString(), DateTimeFormatter.ofPattern(MYSQL_PATTERN));
        return mysqlDate.format(DateTimeFormatter.ofPattern(KPAC_PATTERN));
    }
}
