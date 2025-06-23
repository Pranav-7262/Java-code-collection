package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEg {
    public static void main(String[] args) {
       try {
            FileOutputStream stream = new FileOutputStream("pranav.taxt",true);
            byte []arr = "  panyaaaa".getBytes();
            stream.write(arr);
            stream.close();
           System.out.println("success");
       }
       catch (IOException e) {
           System.out.println(e.getMessage());
       }
    }
}
