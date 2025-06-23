package Searching;

public class EvenNum {
    public static void main(String[] args) {
        int []nums = {23,2443,456,7,88,909,34,90};
        System.out.println(findnum(nums));
       System.out.println(digits2(2767));
    }
    static int findnum(int []nums){
        int cnt=0;
        for (int num:nums){
            if(even(num)){
                cnt++;
            }
        }
        return cnt;
    }
    static boolean even(int num){
        int numofdigits = digits2(num);
        if(numofdigits % 2 == 0){
            return true;


        }
        return false;
    }
    static int digits2(int num){
        if (num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num))+1;



    }
//    static int digits(int num){
//        if (num<0){
//            num = num*-1;
//        }
//        if (num==0){
//            return 1;
//        }
//        int cnt = 0;
//        while (num>0){
//            cnt++;
//            num = num/10;
//        }
//        return cnt;
//    }
}
