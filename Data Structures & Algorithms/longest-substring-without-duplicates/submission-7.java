class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        if(s.length() == 0) {
            return 0;
        }

        //brute force approach

        for(int i = 0; i < s.length(); i++) {
            Set<Character> charSet = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                if(charSet.contains(s.charAt(j))) {
                    break;
                }
                charSet.add(s.charAt(j));
                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
}
