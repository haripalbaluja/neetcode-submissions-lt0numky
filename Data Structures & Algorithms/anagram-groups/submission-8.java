class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String word = strs[i];
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
        for(List<String> list : anagramMap.values()) {
            resultList.add(list);
        }
        return resultList;
    }
}
