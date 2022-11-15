package ie.atu;
import java.io.*;


public class PART {
    public static void main(String[] args) {
        {
            File myFile = new File("myFile.txt");
            System.out.println("My file is located at "+ myFile.getAbsolutePath());
            String content = "Details to write";
            try
            {
                FileWriter myWriter = new FileWriter(myFile,false);
                myWriter.write("This is group mmmmm");
                myWriter.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }

        }

    }

}
