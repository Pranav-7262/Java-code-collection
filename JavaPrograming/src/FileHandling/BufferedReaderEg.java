package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEg { // byte to char stream then read char stream!!!!
    public static void main(String[] args) {
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("you typed " + reader.readLine());
//        }
        try{
            FileReader fr = new FileReader("pranav.taxt");
          BufferedReader reader = new BufferedReader(fr);
          String str = null;
          while ((str= reader.readLine())!=null){
              System.out.println(str);
          }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
