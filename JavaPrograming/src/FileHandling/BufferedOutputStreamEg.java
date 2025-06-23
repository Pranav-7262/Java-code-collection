package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEg {
    public static void main(String[] args) {
        try{
            FileOutputStream f1 = new FileOutputStream("pranav.taxt");
            BufferedOutputStream bs = new BufferedOutputStream(f1);
            byte []b = "welcome to java".getBytes();
            bs.write(b);
            bs.flush();
            bs.close();
            f1.close();
            System.out.println("success");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
