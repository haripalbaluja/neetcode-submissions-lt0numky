class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 1;

        for(int i = 0; i < s.length(); i++) {
            Map<Character, Integer> freqMap = new HashMap<>();
            int maxFrequency = 0;
            for(int j = i; j < s.length(); j++) {
                freqMap.put(s.charAt(j), freqMap.getOrDefault(s.charAt(j),0)+1);
                maxFrequency = Math.max(maxFrequency, freqMap.get(s.charAt(j)));
                if((j-i+1) - maxFrequency <= k) {
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;
    }
}
