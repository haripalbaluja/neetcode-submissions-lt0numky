class Solution {
    public boolean isAnagram(String s, String t) {

        char[] word1 = s.toCharArray();

        char[] word2 = t.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        String sortedWord1 = new String(word1);
        String sortedWord2 = new String(word2);

        return sortedWord1.equals(sortedWord2);

    }
}
