package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEg {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("pranav.taxt");
            int i = 0;
            while ((i=reader.read())!=-1){
                System.out.println((char)i);
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
