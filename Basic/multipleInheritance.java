import java.util.*;

interface A{
    void show();  // by default public + abstract
}

interface B{
    void show();  // by default public + abstract
}

                
                
public class multipleInheritance implements A,B {


//we need to make show public 
  public void show(){
    System.out.println("Interface A and B");
  }

    public static void main(String[] args) {
        multipleInheritance m = new multipleInheritance();
        m.show();
    }
}