package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*

    1 2 3
    4 5 6
    7 8 9

     */

//int [][]arr=new int[3][];
//  int [][]arr2={
//          {1,2,3,};///0th index of matrix
//           {4,5,6,};///1th index of matrix
//             {7,8,9};///2th index of matrix

        int[][] arr = new int[3][3];
        // System.out.println(arr.length);//no of rows find

        //inputs
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {//for every cols in row
                arr[row][col] = sc.nextInt();
            }
        }
        //output
//                    for(int row=0;row<arr.length;row++){
//                        for(int col=0;col<arr[row].length;col++){//for every cols in row
//                            System.out.print(arr[row][col]+" ");
//                        }
//                        System.out.println();
//                    }
        //output2
//        for (int row = 0; row < arr.length; row++) {
//             System.out.println(Arrays.toString(arr[row]));
      //  }
        for(int []a:arr){ //Advanced for loop
            System.out.println(Arrays.toString(a));
        }
    }

}

