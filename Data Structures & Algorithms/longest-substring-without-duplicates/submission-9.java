class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;

        for(int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                length = Math.max(length, j-i+1);
            }
        }
        return length;
    }
}
