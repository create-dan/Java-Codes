import java.util.*;

class student {
    int roll,marks;
    String name;

    void input()
    {
        System.out.println("Enter roll , marks , name ");
    }

}


class dnyaneshwar extends student {

    void disp(){
        roll = 1;
        marks = 70;
        name = "dnyaneshwar";
        System.out.println(roll+" "+marks+" "+name);
    }

}
                    
                
public class inheritance {
    public static void main(String[] args) {

   dnyaneshwar obj  = new dnyaneshwar();
   obj.input();
   obj.disp();
        
    }
}