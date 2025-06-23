package Searching;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
//int []arr1 = {23,45,56,78,89,90,112,2343,56677};
int []arr2 = {90,87,78,67,63,44,34,23,11};
 int target = 23;
 int ans = oredragnositcs(arr2,target);
        System.out.println(ans);
    }
   static int oredragnositcs(int []arr,int target) {
       int start = 0;
       int end = arr.length - 1;
//    boolean isast:
//       if (arr[start] < arr[end]){
//           isast = true;
//       }
//       else {
//           isast=false;
//       }
       boolean isast = arr[start] < arr[end];

       while (start <= end) {
           int mid = start + (end - start) / 2;
           if (arr[mid] == target) {
               return mid;
           }
           if (isast) {
               if (arr[mid] < target) {
                   start = mid + 1;
               } else {
                   end = mid -1;
               }
           } else {
               if (arr[mid] > target) {
                   start = mid +1;
               } else {
                  end = mid -1;
               }
           }

       }
       return -1;


}

}

