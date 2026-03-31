class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {

            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);
            map.putIfAbsent(sortedWord, new ArrayList<String>());
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}
