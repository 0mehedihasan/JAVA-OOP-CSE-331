
import java.util.*;
class ArrayTwoD {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] A=new int[3][3];
       int [][] B=new int [3][3];
       int [][] C=new int [3][3];
       System.out.printf("for arrat A:\n");
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.printf("Row: %d Column: %d Enter Value:",row,col);
                A[row][col]=input.nextInt();
            }
        }

System.out.printf("for arrat B:\n");
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.printf("Row: %d Column: %d Enter Value:",row,col);
                B[row][col]=input.nextInt();
            }
        }

        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
              C[row][col]=A[row][col]+B[row][col];
            }
        }


        for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.printf("Array C: Row %d Column %d : %d",i,j,C[i][j]);
           }
       }
    }
}



