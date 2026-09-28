class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;

        int high = 0;
        for(int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        int result = 0;

        while(low <= high) {
            int mid = (low + high)/2;

            int time = 0;

            for(int i = 0; i < piles.length; i++) {
                time += Math.ceil((double)piles[i]/mid);
            }
            if(time <= h) {
                result = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }
}
