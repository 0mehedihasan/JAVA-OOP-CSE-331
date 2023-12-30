import java.util.Scanner;//input package
class CheckVowel {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       char ch;
       System.out.printf("Enter a Character=");
       ch=input.next().charAt(0);//next for String which can be long.but charAt defines which index can be taken
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       {
           System.out.printf("Correct,it is a vowel.");
       }
       else
       {
           System.out.printf("It is not a vowel.");
       }
        
    }
}
