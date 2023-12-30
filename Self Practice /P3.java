import java.util.*;//All packages
class Product {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int id,price;
        String title,description,category;
        
       System.out.printf("Enter Id=");
       id=input.nextInt();
       System.out.printf("\n Id=%d",id);
       
       System.out.println("\nEnter Price=");
       price=input.nextInt();
       System.out.printf("\n Price=%d\n",price);
       System.out.printf("Enter Title=");
       title=input.next();
       System.out.println("Title="+title);
       
       System.out.printf("Enter Description=");
       description=input.nextLine();
       System.out.println("\nDescription="+description);
    }
}
