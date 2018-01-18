package com.at.learning;

/*
Given a time in -hour AM/PM format, convert it to military (-hour) time.

Note: Midnight is on a -hour clock, and on a -hour clock. Noon is on a -hour clock, and on a -hour clock.

Input Format

A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM    ), where
01 <= hh <= 12 and 00 <= mm, ss <= 59.

Output Format

Convert and print the given time in -hour format, where 00<=hh<=23.

Sample Input

07:05:45PM

Sample Output

19:05:45

 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class TimeConversion {

    static String timeConversion(String s) {
    String result = "";
    String hour = "";
    String mins = "";
    String sec = "";
    StringTokenizer st = new StringTokenizer(s, ":");
    while (st.hasMoreElements()) {
        hour = st.nextElement().toString();
        mins = st.nextElement().toString();
        sec = st.nextElement().toString();
    }
    //Validations
    if (Integer.parseInt(hour) > 12) {
        throw new IllegalArgumentException("Hour cannot be greater than 12 in 12 hr time system.");
    }
    if (Integer.parseInt(mins) > 60) {
        throw new IllegalArgumentException("minutes cannot be greater than 60.");
    }
    if (Integer.parseInt(sec.substring(0,sec.length() - 2)) > 60) {
            throw new IllegalArgumentException("seconds cannot be greater than 60.");
    }

    if (sec.endsWith("PM")) {
        if (Integer.parseInt(hour) < 12) {
            hour = String.valueOf(Integer.parseInt(hour) + 12);
        }
        sec = sec.substring(0,sec.length() -2);
        result = String.valueOf(hour).concat(":").concat(mins).concat(":").concat(sec);
    } else if (sec.endsWith("AM")) {
        if (Integer.parseInt(hour) == 12) {
            hour = "00";
        }
        sec = sec.substring(0,sec.length() - 2);
        result = String.valueOf(hour).concat(":").concat(mins).concat(":").concat(sec);
    } else {
        throw new IllegalArgumentException("Time must end in AM/PM");
    }
    return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
