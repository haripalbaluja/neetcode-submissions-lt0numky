class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++) {
            int length = 0;
            Set<Character> charSet = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                if(charSet.contains(s.charAt(j))) {
                    break;
                } else {
                    charSet.add(s.charAt(j));
                    length++;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }
}
