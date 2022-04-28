package CLI;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CliDemo {
    public static void main(String[] args) {
        try{
            File file = new File("test.txt");
            if (!file.exists())
                file.createNewFile();


            FileWriter writer = new FileWriter(file);
            writer.append("1 this is the first line ");
            writer.append(System.lineSeparator());
            writer.append("2 this is the second line ");

            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
