import java.util.*;
                    
                
public class Calculator {
    public static void main(String[] args) {
        
        System.out.println("Enter two numbers ");
        Scanner s = new Scanner(System.in);

        int a,b;
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Choose one option ");
        System.out.println("1)Addition");
        System.out.println("2)Subtraction");
        System.out.println("3)Multiplication");
        System.out.println("4)Division");

        int option ;
        option = s.nextInt();

        if(option==1)
        {
            System.out.println(a+b);
        }
        else if(option==2)
        {
            System.out.println(a-b);
        }
        else if(option==3)
        {
            System.out.println(a*b);
        }
        else if(option==4){
            System.out.println(a/b);
        }
        else{
            System.out.println("Wrong Option");
        }
    }
}