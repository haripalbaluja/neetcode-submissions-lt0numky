class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        char[] word1Array = s.toCharArray();

        char[] word2Array = t.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        String s1 = new String (word1Array);
        String s2 = new String (word2Array);

        if(s1.equals(s2)) {
            return true;
        } else {
            return false;
        }

    }
}
