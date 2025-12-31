package Math;

public class MinCost {
    public static void main(String[] args) {
        System.out.println(minimumCost(5,4,15,2,3));
    }
    public static long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        int lumiscaron = cost1 + cost2;
        int effectiveCostBoth = Math.min(costBoth, lumiscaron);

        int effectiveCost1 = Math.min(cost1, costBoth);
        int effectiveCost2 = Math.min(cost2, costBoth);

        long totalCost = 0;
        int overlap = Math.min(need1, need2);
        totalCost += (long) overlap * effectiveCostBoth;

        int remaining1 = need1 - overlap;
        int remaining2 = need2 - overlap;

        totalCost += (long) remaining1 * effectiveCost1;
        totalCost += (long) remaining2 * effectiveCost2;

        return totalCost;

    }
}
