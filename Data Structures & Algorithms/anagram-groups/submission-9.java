class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = new String(wordArr);

            if (!anagramMap.containsKey(sortedWord)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                anagramMap.put(sortedWord, list);

            } else {
                List<String> anagramList = anagramMap.get(sortedWord);
                anagramList.add(strs[i]);
                anagramMap.put(sortedWord, anagramList);
            }
        }

        for(List<String> list : anagramMap.values()) {
            result.add(list);
        }
        return result;
    }
}
