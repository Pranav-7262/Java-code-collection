package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
int [] arr = {3,5,2,1};
        selectionSort(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    private static void selectionSort(int []arr) {

        int len = arr.length;

        for (int i = 0; i < len-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < len; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
