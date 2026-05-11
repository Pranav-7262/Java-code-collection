package Arrays;

public class EqualSumGridPartition {
    public static void main(String[] args) {
     int [][]arr = {{1,4} , {2,3}};
        System.out.println(canPartitionGrid(arr));
    }
    public static boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long totalSum = 0;

        long [] row = new long[m];
        long [] col = new long[n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                long val =  grid[i][j];
                totalSum += val;
                row[i] += val;
                col[j] += val;
            }
        }
        if((totalSum & 1) == 1) return false;
        long target = totalSum / 2;
        long Hsum = 0;

        for(int j=0;j<m-1;j++) {
            Hsum += row[j];
            if(Hsum == target) {
                return true;
            }
        }
        long Vsum = 0;
        for(int k=0;k<n-1;k++) {
            Vsum += col[k];
            if(Vsum == target){
                return true;
            }
        }
        return false;
    }
}
