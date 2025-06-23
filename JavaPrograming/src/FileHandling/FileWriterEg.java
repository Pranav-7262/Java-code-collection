package FileHandling;

import java.io.FileWriter;

public class FileWriterEg {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("pranav.taxt");
            writer.write("welcome to home my dear !!!");
            writer.close();
            System.out.println("success");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
