import java.util.Scanner;

interface Contact_Numbers {
    void Dial_number();
    void Save_number(String name, String number);
}

interface Messages {
    void Send_Message(int message_length);
    void Receive_Message();
}

interface Weather {
    String get_locationName();
    void set_locationName(String l_name);
    int get_Temperature();
    void set_temperature(int temperature);
    void PrintWeatherInfo();
}

class SimpleJavaPhone implements Contact_Numbers, Messages, Weather {
    String contactName;
    String contactNumber;
    int messageLength;
    String locationName;
    int temperature;

    public void Dial_number() {
        System.out.println("Dialing " + contactNumber + "...");
    }

    public void Save_number(String name, String number) {
        if (number.matches("\\d{11}")) {
            contactName = name;
            contactNumber = number;
            System.out.println("Contact saved:");
            System.out.println("Name: " + contactName);
            System.out.println("Phone Number: " + contactNumber);
        } else {
            System.out.println("Invalid number format! Number must have 11 digits.");
        }
    }

    public void Send_Message(int message_length) {
        if (message_length <= 200) {
            this.messageLength = message_length;
            System.out.println("Message sent with length: " + messageLength);
        } else {
            System.out.println("Message length exceeds 200 words!");
        }
    }

    public void Receive_Message() {
        System.out.println("Message received!");
    }

    public String get_locationName() {
        return locationName;
    }

    public void set_locationName(String l_name) {
        locationName = l_name;
    }

    public int get_Temperature() {
        return temperature;
    }

    public void set_temperature(int temperature) {
        this.temperature = temperature;
    }

    public void PrintWeatherInfo() {
        System.out.println("Weather at " + locationName + ": " + temperature + "degC");
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleJavaPhone phone = new SimpleJavaPhone();

        // Save contact information
        phone.Save_number("Md Mehedi Hasan", "01537168991");

        // Test Dialing
        phone.Dial_number();

        // Test Message
        phone.Send_Message(150);
        phone.Receive_Message();

        // Test Weather
        phone.set_locationName("Dhaka");
        phone.set_temperature(44);
        phone.PrintWeatherInfo();
    }
}
