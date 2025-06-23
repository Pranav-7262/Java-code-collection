package Practicals;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        int []nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements :");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Array elements are :");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("number at index "+i+":" +nums[i]);
        }
        int sum = 0;
        for (int num:nums){
            sum += num;
        }
        System.out.println("sum is :"+sum);
    }
}
