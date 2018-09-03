package managedmyschool.Controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author achrafchennan
 */
public class HelperMethodes {

    public HelperMethodes() {
    }
    public static final String selectYear = "Selecteer een Jaar";
    public static final String selectMonth = "Selecteer een Maand";
    public static final String selectTeacher = "Selecteer een Leraar";

    public java.sql.Date getDate(Date birthDay) {
        Calendar now = Calendar.getInstance();
        now.setTime(birthDay);
        now.set(Calendar.HOUR_OF_DAY, 6);
        Date newDate = now.getTime();
        return new java.sql.Date(newDate.getTime());

    }

    public static Date getBirthDay(String geboorteDatum) {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        Date date = null;
        java.sql.Date sqlDate = null;
        try {
            date = formatter.parse(geboorteDatum);
            sqlDate = new java.sql.Date(date.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     *
     * @param var
     * @return
     */
    public static Boolean checkIfNull(String var) {

        if (var.replace(" ", "") == "") {
            return true;
        } else {
            return false;
        }
    }

    public static List<LocalDate> weeksInCalendar(YearMonth month, DayOfWeek dayOfWeek) {
        List<LocalDate> firstDaysOfWeeks = new ArrayList<>();
        for (LocalDate day = firstDayOfCalendar(month, dayOfWeek); stillInCalendar(month, day); day = day
                .plusWeeks(1)) {
            firstDaysOfWeeks.add(day);
        }
        return firstDaysOfWeeks;
    }

    private static LocalDate firstDayOfCalendar(YearMonth month, DayOfWeek dayOfWeek) {
        DayOfWeek FIRST_DAY_OF_WEEK = dayOfWeek;
        return month.atDay(1).with(FIRST_DAY_OF_WEEK);
    }

    private static boolean stillInCalendar(YearMonth yearMonth, LocalDate day) {
        return !day.isAfter(yearMonth.atEndOfMonth());
    }
}
