import java.util.*;
                    
                
public class method {
    public static void main(String[] args) {

        method obj = new method();

        obj.sum(5,5);//actual parameters
        
    }

    void sum(int a, int b)//formal parameters
    {
        System.out.println(a+ b);
    }
}