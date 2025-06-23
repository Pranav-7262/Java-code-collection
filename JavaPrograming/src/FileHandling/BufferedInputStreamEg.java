package FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEg {
    public static void main(String[] args) {
        try{
            FileInputStream f1 = new FileInputStream("pranav.taxt");
            BufferedInputStream bs = new BufferedInputStream(f1);
            int i=0;

            while ((i=bs.read())!=-1){
                System.out.println((char) i);

            }
            bs.close();
            f1.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
