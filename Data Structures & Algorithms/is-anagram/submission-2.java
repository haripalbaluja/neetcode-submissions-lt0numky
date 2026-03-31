class Solution {
    public boolean isAnagram(String s, String t) {

        char[] word1Array = s.toCharArray();

        char[] word2Array = t.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        String word1 = new String(word1Array);
        String word2 = new String(word2Array);

        return word1.equals(word2);


    }
}
