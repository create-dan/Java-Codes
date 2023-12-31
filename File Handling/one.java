import java.util.*;
import java.io.*;
                    
                
public class one {
    public static void main(String[] args) {
        File f = new File("just.txt");

       try{
                if(f.createNewFile())
        {
            System.out.println("File created");
        }
        else
        {
            System.out.println("File allready exitsted");
        }

       }
       catch(IOException i){
            System.out.println("Exception Handled");
       }



    }
}