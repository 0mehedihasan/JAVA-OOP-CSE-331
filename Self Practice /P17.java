//username and Password check
import java.util.*;
class Ssystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String username;
        String pass;
        String u="mehedi";
        String p="1234";
        int c=1;
        while(c!=0)
        {
            System.out.printf("\nEnter Username:");
            username=input.next();
            System.out.printf("\nEnter password:");
            pass=input.next();
            //if(username==u && pass==p)
            if(username.equals(u) && pass.equals(p))
            {
                System.out.printf("\nWelcome to the System");
                c=0;
            }
            else
            {
                System.out.printf("\nTry Again");
                
            }
        }
    }
}

