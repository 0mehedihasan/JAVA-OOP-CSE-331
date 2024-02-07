/*
Create an interface named Account including getName(), setName(), getPassword() and
setPassword(). Create another interface named Email which includes getOtp(), setOtp(), and
verifyEmail(). Create a class Person which must implement them. Complete the code.
*/

interface Account {
    String getName();
    void setName(String name);
    String getPassword();
    void setPassword(String Password);
}
interface Email {
    String getOtp();
    void setOtp(String OTP);
    boolean verifyEmail();
}
class Person implements Account, Email {
    String name;
    String password;
    String otp;
    boolean emailVerify;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getOtp() {
        return otp;
    }
    public void setOtp(String otp) {
        this.otp = otp;
    }
    public boolean verifyEmail() {
        
        return emailVerify;
    }
}
class HelloWorld {
    public static void main(String[] args) {
         Person person = new Person();
        person.setName("Mehedi");
        person.setPassword("1212");
        person.setOtp("3334");
        person.verifyEmail();

        System.out.println("name: " + person.getName());
        System.out.println("password: " + person.getPassword());
        System.out.println("Is email verified? " + person.verifyEmail());
    }
}
