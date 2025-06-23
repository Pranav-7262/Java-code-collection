package FileHandling;

import java.io.CharArrayReader;

public class CharArrayReaderEg {
    public static void main(String[] args) throws Exception{
        char []arr = {'j','a','v','a'};
        CharArrayReader reader = new CharArrayReader(arr);
        int k=0;
        while ((k=reader.read())!=-1){
          char ch = (char) k;
            System.out.print(ch +" ");
            System.out.print(k);
            System.out.println();
        }

    }
}
