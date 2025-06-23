package FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEg {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte []b = "Pranav".getBytes();
        stream.write(b);
        System.out.println(stream.toString());
        stream.close();
    }
}
