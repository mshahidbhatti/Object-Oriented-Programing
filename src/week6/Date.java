package week6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day>0 && day <=31)
            this.day = day;
    }

    public void setMonth(int month) {
        if(month>0&& month<=12)
            this.month = month;
    }

    public void setYear(int year) {
        if(year>0)
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d-%d-%d",getDay(),getMonth(),getYear());
    }
}
