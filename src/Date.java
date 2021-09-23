

//classes and objects
//instance variables
//data encapuslation
//setters and getters
//constructor


public class Date {

    // attributes of the class
    //instance variables
    private int day;  // day> 0 and day <=31
    private int month;  // month >0 && month <=12
    private int year;  // year > 1950



    //constructor
    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;

    }

    // setters and getters
    public void setDay(int d){
        if(d>0 && d <=31)
            day = d;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int m){
        if(m>0 && m<=12)
            month = m;

    }

    public int getMonth(){
        return month;
    }

    public void setYear(int y){
        if(y>1949)
            year=y;

    }

    public int getYear(){
        return year;
    }


    public void displayDate(){
        System.out.printf("%d/%d/%d",day,month,year);
    }




}
