class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int maxLen = 0;
        int[] freqArray = new int[26];

        while(r < s.length()) {
            freqArray[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq, freqArray[s.charAt(r)-'A']);

            while((r-l+1)- maxFreq > k) {
                freqArray[s.charAt(l)-'A']--;
                maxFreq = 0;
                for(int i = 0; i < 26; i++) {
                    maxFreq = Math.max(maxFreq, freqArray[i]);
                }
                l++;
            }


            if((r-l+1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
