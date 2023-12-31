import java.util.*;
                    
                
public class array {
    public static void main(String[] args) {
        
        int a [] = {10,20,30,40};
        // System.out.println(a[0]);

 
         //for each loop
        // for(int b : a)
        // {
        //     System.out.println(b+" ");
        // }

        int arr[] = new int[5];

        Scanner s = new Scanner(System.in); // scanner is also class we make object of it for using like here s is object of scanner class
        System.out.println("Enter arrary elements ");
        for(int i=0;i<5;i++)
        {
             arr[i] = s.nextInt();
        }

        for(int b : arr)
        {
            System.out.print(b+" ");
        }
        System.out.println();

        Arrays.sort(arr); // using Arrays class of util package
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}