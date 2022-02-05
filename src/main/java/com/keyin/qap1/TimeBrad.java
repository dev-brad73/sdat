package com.keyin.qap1;

public class TimeBrad {

    private int hour;
    private int minute;
    private int second;

    public TimeBrad(int hr, int min, int sec) {
        this.hour = hr;
        this.minute = min;
        this.second = sec;
    }

    public int getHour() {
        return (hour);
    }

    public int getMinute() {
        return (minute);
    }

    public int getSecond() {
        return (second);
    }

    public void setHour(int h) {
        this.hour = h;
    }

    public void setMinute(int m) {
        this.minute = m;
    }

    public void setSecond(int s) {
        this.hour = s;
    }

    public void setTime(int hr, int min, int sec) {
        this.hour = hr;
        this.minute = min;
        this.second = sec;
    }

    public String toString() {
        String time = "";

        String h = String.valueOf(hour);
        String m = String.valueOf(minute);
        String s = String.valueOf(second);

        if (hour >= 0 && hour < 10) {
            h = "0" + hour;
        }

        if (minute >= 0 && minute < 10) {
            m = "0" + minute;
        }

        if (second >= 0 && second < 10) {
            s = "0" + second;
        }

        time = h + ":" + m + ":" + s;

        return time;
    }

    public TimeBrad nextSecond() {

        if (second <= 58) {
            second += 1;
        } else if (second == 59 && minute <= 58) {
            second = 0;
            minute += 1;
        } else if (second == 59 && minute == 59 && hour <= 22) {
            second = 0;
            minute = 0;
            hour += 1;
        } else if (second == 59 && minute == 59 && hour == 23) {
            second = 0;
            minute = 0;
            hour = 0;
        }

        return (this);
    }

    public TimeBrad previousSecond() {
        if (second >= 1) {
            second -= 1;
        } else if (second == 00 && minute >= 1) {
            second = 59;
            minute -= 1;
        } else if (second == 00 && minute == 00 && hour >= 1) {
            second = 59;
            minute = 59;
            hour -= 1;
        } else if (second == 00 && minute == 00 && hour == 00) {
            second = 59;
            minute = 59;
            hour = 23;
        }

        return (this);
    }
}
