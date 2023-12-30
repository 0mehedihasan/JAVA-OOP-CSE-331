import java.util.*;// all packages
class MehediHasan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float base,height,area;
       
        System.out.printf("Enter Base=");
        base=input.nextFloat();
        
        System.out.printf("\nEnter Height=");
        height=input.nextFloat();
        
        area = (float) (0.5 * base * height);//for type casting
        
      System.out.println("Area="+area);
    }
}
