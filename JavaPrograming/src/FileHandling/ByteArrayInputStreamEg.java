package FileHandling;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamEg {//example of Byte Stream class...
    public static void main(String[] args) throws IOException {
        byte []b = "pranav varpe".getBytes();
        ByteArrayInputStream stream = new ByteArrayInputStream(b);
        int n = stream.available();
        System.out.println("availabls bytes : "+n);
        int i =0;
        while ((i = stream.read()) != -1){
            System.out.print((char)i);

        }

    }
}
