package lesson5hw;

import java.time.LocalTime;

public class Time {
    private int hour;
    private int min;

    public Time() {
    }

    public Time(int hour, int min) {
        if (hourIsValid(hour) && minIsValid(min)) {
            this.min = min;
            this.hour = hour;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hourIsValid(hour)) {
            this.hour = hour;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (minIsValid(min)) {
            this.min = min;
        }
    }

    private boolean hourIsValid(int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println(String.format("Wrong hour %s (hour: 0...23)", hour));
            return false;
        } else return true;
    }

    private boolean minIsValid(int min) {
        if (min < 0 || min > 59) {
            System.out.println(String.format("Wrong min %s (min: 0...59)", min));
            return false;
        } else return true;
    }

    public static Time sumTime(Time time1, Time time2) {
        LocalTime localTime1 = LocalTime.of(time1.getHour(), time1.getMin());
        LocalTime localSum = localTime1.plusHours(time2.getHour()).plusMinutes(time2.getMin());
        return new Time(localSum.getHour(), localSum.getMinute());
    }

    public static int beforeTime(Time time1, Time time2) {
        LocalTime localTime1 = LocalTime.of(time1.getHour(), time1.getMin());
        LocalTime localTime2 = LocalTime.of(time2.getHour(), time2.getMin());
        int result = 0;
        if (localTime1.isBefore(localTime2)) {
            result = 1;
        } else if (localTime1.isAfter(localTime2)) {
            result = -1;
        }
        return result;
    }

    @Override
    public String toString() {

        String sHour = Integer.toString(this.getHour());
        if (sHour.length() == 1) {
            sHour = "0" + sHour;
        }
        String sMin = Integer.toString(this.getMin());
        if (sMin.length() == 1) {
            sMin = "0" + sMin;
        }

        return sHour + ":" + sMin;
    }


}

