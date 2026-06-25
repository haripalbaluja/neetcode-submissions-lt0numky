class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] word1Arr = s.toCharArray();
        char[] word2Arr = t.toCharArray();

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        String word1 = new String(word1Arr);
        String word2 = new String(word2Arr);

        return word1.equals(word2);
    }
}
