package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxCapacityWithBudget
{
    public static void main(String[] args) {
    int []arr =  {1,7,3};
    int  []capacity = {7,3,5};
        System.out.println(maxCapacity(arr,capacity,13));
    }
    public static int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        List<int []> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            list.add(new int[]{costs[i] , capacity[i]});
        }
        list.sort((a , b) -> a[0] - b[0]);
        int maxi = 0;
        for(int[]arr : list) {
            if(arr[0] < budget){
                maxi = Math.max(maxi , arr[1]);
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int cSum = costs[i] + costs[j];
                if(cSum < budget) {
                    int capsum = capacity[i] + capacity[j];
                    maxi = Math.max(maxi , capsum);
                }
            }
        }
        return maxi;
    }
}
