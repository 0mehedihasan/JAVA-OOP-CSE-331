/*
2. Write a Java proram to create an abstract class named Sortable with a non-abstract method
named getData() and an abstract method named sort(int[] array) that sorts an array of integers in
descending order. Create two classes BubbleSort and SelectionSort that implements the sortable
interface.
*/

import java.util. *;
//ABSTRACT CLASS        
abstract class Sortable 
{
     void getData()//non abstract tai body ase
     {
         
     }
    
    abstract void sort(int[] array);//abstract tai body nai
    
}
class BubbleSort extends Sortable 
{
    void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (a[j] < a[j + 1]) 
                {
                    int temp = a[j]; //swap method
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort extends Sortable 
{
    void sort(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int max = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (a[j] > a[max])
                    max = j;
            }
            int temp = a[max];
            a[max] = a[i];
            a[i] = temp;
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 5, 6};
        
        BubbleSort bsort = new BubbleSort();
        bsort.getData(); // emnei kono kaj nai call na korleo hoi
        bsort.sort(a);
        
        System.out.println("Bubble Array: " + Arrays.toString(a));

        int[] b = {8, 3, 6, 2, 7, 1};
        
        SelectionSort ssort = new SelectionSort();
        ssort.getData();
        ssort.sort(b);
        System.out.println("Selection Sorted Array: " + Arrays.toString(b));
    }
}
