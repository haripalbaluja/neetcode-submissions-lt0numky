class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String newWord = new String(word);
            map.putIfAbsent(newWord, new ArrayList<String>());
            map.get(newWord).add(strs[i]);
        }


        return new ArrayList<>(map.values());
    }
}
