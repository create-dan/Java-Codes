import java.util.*;
import java.io.*;
                    
                
public class two {
    public static void main(String[] args) {
        try{
             FileWriter f = new FileWriter("two.txt");
             try{
                  f.write("writing in a file");
             }
             
             finally{
                f.close();
             }
             System.out.println("Data written in file");
        }
        catch(IOException i){
                   System.out.println(i);
        }
    }
}