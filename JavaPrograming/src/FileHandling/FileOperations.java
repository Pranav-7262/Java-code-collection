package FileHandling;

import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        //1.creating new file --->
//        try {
//            File file = new File("pranav.txt");
//            file.createNewFile();
//            System.out.println("ok");
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        //2.write in file ----->
//        try (FileWriter writer = new FileWriter("pranav.taxt")) {
//            writer.write("Top cha vishay Bandaa!!!!!!!!!");
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        //3.read the file ------>
//        try(BufferedReader br = new BufferedReader(new FileReader("pranav.taxt"))) {
//            while (br.ready()){
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        //create a file and delete ------>
        try {
            File file = new File("random.txt");
            file.createNewFile();
            System.out.println("file is created!!!!");
            if(file.delete()) {
                System.out.println(file.getName()+" is deleted.....");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
