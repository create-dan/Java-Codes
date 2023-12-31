import java.util.*;

public class factorial{
    public static void main(String arg[]){
        int num;
        System.out.println("Enter the number");

        Scanner s = new Scanner(System.in);

        num = s.nextInt();

        long  fact = calculateFactorial(num);
       System.out.println("The factorial of "+num+" is "+fact);




    }

    public static long calculateFactorial(int num)
    {
        if(num==0 || num==1) return 1;

        return num*calculateFactorial(num-1);

    }
}