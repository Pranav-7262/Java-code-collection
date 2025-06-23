package FileHandling;

import java.io.FileInputStream;

public class FileInputStreamEg {
    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream("pranav.taxt");
//            int i = stream.read();
            int n =0 ;
            while ((n=stream.read())!=-1){
                System.out.println((char)n);
            }
//            System.out.println((char)i);
            stream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
