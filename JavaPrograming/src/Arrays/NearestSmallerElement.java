
package Arrays;
class NearestSmallerElement {

   public static void printPrevSmaller(int[] arr)
    {

        System.out.print("_, ");

        for (int i = 1; i < arr.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    System.out.print(arr[j] + ", ");
                    break;
                }
            }
            // If there is no smaller element on left of 'i'
            if (j == -1)
                System.out.print("_, ");
        }
    }


    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 0, 2, 5 };
        printPrevSmaller(arr);
    }
}