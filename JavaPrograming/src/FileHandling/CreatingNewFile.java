package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingNewFile {
    public static void main(String[] args) throws IOException {
        File f = new File("demo.tax");
        f.createNewFile();
        System.out.println("File created !!!");
        System.out.println(f.getName());
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.canRead());
        System.out.println(f.canExecute());
        System.out.println(f.canWrite());
    }
}
