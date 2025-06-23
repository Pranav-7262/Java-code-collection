package FileHandling;

import java.io.*;
public class BufferedWriterEg {
    public static void main(String[] args) {
//        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){
//            writer.write("pp");
     //   }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("pranav.taxt"))){
            writer.write("chennai super kings");
            System.out.println("success");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
