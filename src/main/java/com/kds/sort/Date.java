package com.kds.sort;

public class Date implements Comparable<Date> {
    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) throws Exception {
        if (month>12||day>31)
            throw new Exception("输入时间错误");
        else {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int compareTo(Date o) {
        if (this.year>o.year)
            return 1;
        if (this.year<o.year)
            return -1;
        if (this.month>o.month)
            return 1;
        if (this.month<o.month)
            return -1;
        if (this.day>o.day)
            return 1;
        if (this.day<o.day)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
