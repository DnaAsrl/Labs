package main;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public void checkTime (){
        if(hour>=0&&hour<=23)
             if (minute>=0&&minute<=59)
                 displayTime();
    }
    
    public void displayTime (){
        if (hour>=12)
            System.out.println(hour+":"+minute+"PM");
        else
            System.out.println(hour+":"+minute+"AM");
    }
}
