package Strings;

public class WiFiRange {
    public static void main(String[] args) {
      String str = "10010";
      int x = 1;
        System.out.println(wifiRange(str,x));
    }
    public static boolean wifiRange(String s, int x) {
        // code here
        int n = s.length();
        boolean []valid = new boolean[n];
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == '1') {
                int left = Math.max(0 , i-x);
                int right = Math.min(n-1 , i+x);

                for(int j=left;j<=right;j++) {
                    valid[j] = true;
                }
            }
        }
        for(boolean room : valid) {
            if(!room) return false;
        }
        return true;
    }
}
