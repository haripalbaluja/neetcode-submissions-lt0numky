class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++) {
            Set<Character> charSet = new HashSet<>();
            int length = 0;
            for(int j = i; j < s.length(); j++) {
                if(!charSet.contains(s.charAt(j))) {
                    charSet.add(s.charAt(j));
                    length++;
                    maxLength = Math.max(length, maxLength);
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }
}
