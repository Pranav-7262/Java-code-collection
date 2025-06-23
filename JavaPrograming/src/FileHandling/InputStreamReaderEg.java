package FileHandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEg {
    public static void main(String[] args) {

         try(InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
             System.out.print("Enter some letters");
             int letters = inputStreamReader.read();
             while (inputStreamReader.ready()){
                 System.out.println((char) letters);
                 letters = inputStreamReader.read();
             }
             System.out.println();
         }
         catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }

}
