interface Java_Account {
    String getAccount_name();
    void setAccount_name(String name);
}

interface Java_Password {
    String getPassword();
    void setPassword(String password);
}

interface Java_Verify_me {
    String getNumber();
    void sendOTP(String number);
    boolean verifyOTP(String otp);
}

class Account implements Java_Account, Java_Password, Java_Verify_me {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String otp;

    @Override
    public String getAccount_name() {
        return firstName + " " + lastName;
    }

    @Override
    public void setAccount_name(String name) {
        String[] names = name.split(" ");
        if (names.length == 2) {
            if (Character.isUpperCase(names[0].charAt(0)) && Character.isUpperCase(names[1].charAt(0))) {
                firstName = names[0];
                lastName = names[1];
            } else {
                System.out.println("The first letter of both firstname and lastname must be in uppercase");
            }
        } else {
            System.out.println("Please provide both firstname and lastname");
        }
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") && password.matches(".*[@#$%^&+=].*")) {
            this.password = password;
        } else {
            System.out.println("Please follow the proper format for password");
        }
    }

    @Override
    public String getNumber() {
        return phoneNumber;
    }

    @Override
    public void sendOTP(String number) {
        // Simulate sending OTP
        otp = "1234"; // Dummy OTP
        phoneNumber = number;
        System.out.println("OTP sent to " + number);
    }

    @Override
    public boolean verifyOTP(String otp) {
        if (this.otp.equals(otp)) {
            System.out.println("OTP verification successful.");
            return true;
        } else {
            System.out.println("OTP is wrong, try again");
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccount_name("Mehedi Hasan");
        account.setPassword("OnePiece#@1");
        account.sendOTP("01537168991");
        account.verifyOTP("1234"); // Correct OTP
        System.out.println("Account Name: " + account.getAccount_name());
        System.out.println("Password: " + account.getPassword());
    }
}
