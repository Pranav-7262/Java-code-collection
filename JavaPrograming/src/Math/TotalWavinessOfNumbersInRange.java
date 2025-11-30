package Math;

public class TotalWavinessOfNumbersInRange {
    public static void main(String[] args) {
        System.out.println(totalWaviness(198,202));
    }
    public static int totalWaviness(int num1, int num2) {
        int waviness = 0;
        for (int i = num1; i <= num2; i++) {
            waviness += isWaviness(i);
        }
    return waviness;
    }

    private static int isWaviness(int num) {
        int []arr = new int[10];
        int len = 0 , temp = num;
        while(temp > 0) {
            arr[len++] = temp % 10;
            temp /= 10;
        }
        for(int i=0;i<len/2;i++) {
            int t = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = t;
        }
        if(len < 3) return 0;
        int count = 0;
        for(int i=1;i<len-1;i++) {
            if((arr[i] > arr[i-1] && arr[i] > arr[i+1]) || (arr[i] < arr[i-1] && arr[i] < arr[i+1])) {
                count++;
            }
        }
        return count;

    }


}
