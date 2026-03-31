class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> anagramMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String newWord = new String(word);
            if(anagramMap.containsKey(newWord)) {
                List<String> list = anagramMap.get(newWord);
                list.add(strs[i]);
                anagramMap.put(newWord, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                anagramMap.put(newWord, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> list : anagramMap.values()) {
            result.add(list);
        }
        return result;
    }
}
