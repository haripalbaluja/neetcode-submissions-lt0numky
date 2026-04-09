class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(int i=0; i < strs.length; i++) {
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String sortedWord = new String(array);

            if(anagramMap.containsKey(sortedWord)) {
                List<String> list = anagramMap.get(sortedWord);
                list.add(strs[i]);
                anagramMap.put(sortedWord, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                anagramMap.put(sortedWord, list);
            }
        }
        List<List<String>> result = new ArrayList<>(anagramMap.values());
        return result;
    }
}
