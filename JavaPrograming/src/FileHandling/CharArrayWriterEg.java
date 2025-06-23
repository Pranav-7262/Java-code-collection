package FileHandling;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterEg {
    public static void main(String[] args) throws Exception{
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("welcome to sharad");
        FileWriter f1 = new FileWriter("pranav.taxt");
        FileWriter f2 = new FileWriter("demo.txt");
        writer.writeTo(f1);
        writer.writeTo(f2);
        System.out.println("ok");
        f1.close();
        f2.close();
    }
}
