class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String word : strs) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if(!anagramMap.containsKey(sortedWord)) {
                List<String> list = new ArrayList<>();
                list.add(word);
                anagramMap.put(sortedWord, list);
            }
            else {
                List<String> list = anagramMap.get(sortedWord);
                list.add(word);
                anagramMap.put(sortedWord, list);
            }
        }

        for(Map.Entry<String, List<String>> map : anagramMap.entrySet()) {
            result.add(map.getValue());
        }

        return result;
    }
}
