class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String newWord = new String(array);
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
        result = new ArrayList<>(anagramMap.values());
        return result;
    }
}
