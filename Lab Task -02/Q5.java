/*
Create a class named Time that must have three integer data members (hours, minutes, and 

seconds). Create two constructors, one member function named add_time (return object), 

and one display function to print the time in 11:59:59 format. The add_time function must 

take two objects as arguments. The main function calls the add_time function to add two-

time objects and store the result in a third object. Use the display function to print the result 

on the console.

Input: 2 55 40, 5 20 30

 Output: 8:16:10
*/
 class Time {
     int hours;
     int minutes;
     int seconds;

     Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

     Time addTime(Time t1, Time t2) {
        int totalSeconds = (t1.hours + t2.hours) * 3600 + (t1.minutes + t2.minutes) * 60 + (t1.seconds + t2.seconds);

        int newHours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int newMinutes = remainingSeconds / 60;
        int newSeconds = remainingSeconds % 60;

        return new Time(newHours, newMinutes, newSeconds);
    }

     void displayTime() {
        System.out.println(hours+":"+minutes+":"+seconds);
    }

    public static void main(String[] args) {
        Time time1 = new Time(2, 55, 40);
        Time time2 = new Time(5, 20, 30);

        Time result = new Time(0, 0, 0);
        result = result.addTime(time1, time2);

        System.out.print("Output: ");
        result.displayTime();
    }
 }
