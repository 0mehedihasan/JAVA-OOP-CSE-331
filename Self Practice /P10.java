import java.util.*;
class CallCenter {
    public static void main(String[] args) {
        System.out.println("Select Language :");
        System.out.println("\t 1. Bengali");
        System.out.println("\t 2. English");
        System.out.println("\t 3. Arabic");
        System.out.println("\t 4. Urdu");
        Scanner input = new Scanner(System.in);
        int dig;
        System.out.printf("Enter:");
        dig=input.nextInt();
        switch(dig)
        {
            case 0:
                {
                    System.out.println("The Bengali language has been selected ");
                break;
                }
            case 1:
                {
                    System.out.println("The English language has been selected ");
                break;
                }
            case 2:
                {
                    System.out.println("The Arabic language has been selected ");
                break;
                }
            case 3:
                {
                    System.out.println("The Urdu language has been selected ");
                break;
                }
            default:
            {
                System.out.println("Default Language is English ");
            }
        }
    }
}

