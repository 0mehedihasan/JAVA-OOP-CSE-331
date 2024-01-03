
import java.util.*;
class ArrayTwoD {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] num=new int[3][3];
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.printf("Row: %d Column: %d Enter Value:",row,col);
                num[row][col]=input.nextInt();
            }
        }
        for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.printf("Row %d Column %d : %d",i,j,num[i][j]);
           }
       }
    }
}

