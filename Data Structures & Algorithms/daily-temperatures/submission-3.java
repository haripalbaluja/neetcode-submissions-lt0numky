class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i = 0; i <= temperatures.length-1; i++) {
            boolean found = false;
            for(int j = i + 1; j < temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]) {
                    result[i] = j-i;
                    found = true;
                    break;
                }
            }
            if(!found) {
                result[i] = 0;
            }
        }
        result[result.length-1] = 0;
        return result;
    }
}
