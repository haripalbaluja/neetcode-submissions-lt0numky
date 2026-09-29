class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int result = 1;
        for(int i = 0; i < s.length(); i++) {
            Set<Character> charSet = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                if(charSet.contains(s.charAt(j))) {
                    break;
                }
                else {
                    charSet.add(s.charAt(j));
                    result = Math.max(result, j-i+1);
                }
            }
        }
        return result;
    }
}
