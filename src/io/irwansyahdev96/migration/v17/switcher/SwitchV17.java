package io.irwansyahdev96.migration.v17.switcher;

import java.time.LocalDate;
import java.time.Month;

public class SwitchV17 {
    
    public static void showSwitch(){
        LocalDate today = LocalDate.of(2018, 12, 12);

        Month month = today.getMonth();

        int day = switch (month) {
            case JANUARY-> io.irwansyahdev96.migration.v17.switcher.constant.Month.JANUARY.getDay();
            case FEBRUARY-> {
                if (today.isLeapYear()) 
                    yield io.irwansyahdev96.migration.v17.switcher.constant.Month.FEBRUARY.getDay() + 1;
                else
                    yield io.irwansyahdev96.migration.v17.switcher.constant.Month.FEBRUARY.getDay();
                
            }
            case MARCH-> io.irwansyahdev96.migration.v17.switcher.constant.Month.MARCH.getDay();
            case APRIL-> io.irwansyahdev96.migration.v17.switcher.constant.Month.APRIL.getDay();
            case MAY-> io.irwansyahdev96.migration.v17.switcher.constant.Month.MAY.getDay();
            case JUNE-> io.irwansyahdev96.migration.v17.switcher.constant.Month.JUNE.getDay();
            case JULY-> io.irwansyahdev96.migration.v17.switcher.constant.Month.JULY.getDay();
            case AUGUST-> io.irwansyahdev96.migration.v17.switcher.constant.Month.AUGUST.getDay();
            case SEPTEMBER-> io.irwansyahdev96.migration.v17.switcher.constant.Month.SEPTEMBER.getDay();
            case OCTOBER-> io.irwansyahdev96.migration.v17.switcher.constant.Month.OCTOBER.getDay();
            case NOVEMBER-> io.irwansyahdev96.migration.v17.switcher.constant.Month.NOVEMBER.getDay();
            case DECEMBER-> io.irwansyahdev96.migration.v17.switcher.constant.Month.DECEMBER.getDay();
        };

        System.out.println(month + " has " + day + " days" );
    }
}
