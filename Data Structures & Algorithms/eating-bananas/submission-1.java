class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxElement = -1;
        for(int i = 0; i < piles.length; i++) {
            maxElement = Math.max(maxElement, piles[i]);
        }
        int minRate = Integer.MAX_VALUE;
        int low = 1;
        int high = maxElement;

        while(low <= high) {
            int mid = (low+high)/2;
            int totalHours = calculateHours(piles, mid);
            if(totalHours <= h) {
                minRate = Math.min(minRate, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return minRate;
    }


    public int calculateHours(int[] piles, int rate) {
        double totalTime = 0;
        for(int i = 0; i < piles.length; i++) {
            totalTime += Math.ceil((double)piles[i]/rate);
        }
        return (int)totalTime;
    }
}
