import java.io.File;

class file_read{
    public static void main(String args[])
    {
        File file = new File("example.txt");

        if(file.exists())
        {
            System.out.println("File exists");
        }
        else{
                        System.out.println("File does not exists");

        }
    }
}