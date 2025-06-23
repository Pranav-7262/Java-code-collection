package Queue;

public class Main {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();

        // Example pings
        int[] pings = {1, 100, 3001, 3002};

        for (int t : pings) {
            System.out.println("Ping at " + t + ": " + recentCounter.ping(t));
        }
    }
}








