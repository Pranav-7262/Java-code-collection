package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEg {//deal with write file
    public static void main(String[] args) {
//        try(OutputStreamWriter writer = new OutputStreamWriter(System.out)){
//            writer.write("pranav");
//            writer.write("\n");
//            writer.write("ok");
//            writer.write("varpe");
//            writer.write(45);
//            writer.write(77);
//            writer.write(69);
//            writer.write("\n");
//            char []arr = "pranav".toCharArray();
//            writer.write(arr);
//        }
        try (FileWriter writer = new FileWriter("demo.txt")){
            writer.write("hello");
        }
        catch (IOException e){
            System.out.println("empty");
            System.out.println(e.getMessage());

        }
    }
}
