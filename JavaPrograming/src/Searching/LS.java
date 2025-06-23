package Searching;

public class LS {
    public static void main(String[] args) {

        int []arr = {12,3,4,5,6,7,33};
        System.out.println(linearsearch(arr,33));
        System.out.println(linearsearch2(arr,4));
    }
    static int linearsearch(int []arr,int target){
        if (arr.length==0){
            return -1;
        }
        //run a for loop to check the target element is found or not
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
                return i;
            }


        }
        return -1;
    }
    static int linearsearch2(int []arr,int target){
        if (arr.length==0){
            return -1;
        }
        //run a for loop to check the target element is found or not
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
                System.out.println("the element "+element+ " is present at " +i+ " location");
            }


        }
        return -1;
    }
}
