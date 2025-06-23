package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //arrays of primitive
        int []arr= new int[5];
        arr[0]=23;
        arr[1]=34;
        arr[2]=44;
        arr[3]=534;
        arr[4]=77;

     //   System.out.println(arr[2]+ arr[0]);

        //inputs using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));//best method for printing the array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//
//       for(int num:arr){//for every element in array print array
//           System.out.print(num+" ");//num is element of an array
//       }

        //arrays of objects
        String []str=new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[0]="pranav";
        System.out.println("After modifying");
        System.out.println(Arrays.toString(str));
    }
}
