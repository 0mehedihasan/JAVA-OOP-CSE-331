/*

*/

interface Contact_Numbers {
    void Dial_number();
    void Save_number(String name, String number);
}

interface Messages {
    void Send_Message(int message_length);
    String Receive_Message();
}

interface Weather {
    String get_locationName();
    void set_locationName(String l_name);
    int get_Temperature();
    void set_temperature(String type_temperature);
    void PrintWeatherInfo();
}

class JavaPhone implements Contact_Numbers, Messages, Weather {
    String contactName;
    String contactNumber;
    int messageLength;
    String receivedMessage;
    String locationName;
    int temperature;

    public void Dial_number() {
        System.out.println("Dial");
    }

    public void Save_number(String name, String number) {
        if (number.startsWith("01") && number.length() == 11) {
            contactName = name;
            contactNumber = number;
            System.out.println("Contact saved.");
        } else {
            System.out.println("Number should start with 01 and have 11 digits.");
        }
    }

    public void Send_Message(int length) {
        if (length <= 200) {
            messageLength = length;
            System.out.println("Message sent");
        } else {
            System.out.println("Message limit is 200 words.");
        }
    }

    public String Receive_Message() {
        return receivedMessage;
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

    public void set_temperature(String type_temperature) {
        // Implement temperature setting logic if needed
    }

    public void PrintWeatherInfo() {
        System.out.println("Location: " + get_locationName());
        System.out.println("Temperature: " + get_Temperature() + " degrees");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        JavaPhone javaPhone = new JavaPhone();
        javaPhone.Dial_number();
        javaPhone.Save_number("Mehedi", "01537168991");
        javaPhone.Send_Message(78);

        javaPhone.set_locationName("Dhaka");
        javaPhone.set_temperature("24");

        javaPhone.PrintWeatherInfo();
    }
}
