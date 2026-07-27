class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        Integer minLength = Integer.MAX_VALUE;

        Map<Character, Integer> freqT = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            freqT.put(t.charAt(i), freqT.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> freqS = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                freqS.put(s.charAt(j), freqS.getOrDefault(s.charAt(j), 0) + 1);
                boolean isMatching = true;
                for (Map.Entry<Character, Integer> map : freqT.entrySet()) {
                    Character key = map.getKey();
                    Integer value = map.getValue();
                    if (freqS.getOrDefault(key, 0) < value) {
                        isMatching = false;
                        break;
                    }
                }
                if (isMatching && j - i + 1 < minLength) {
                    minLength = j-i+1;
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }
}
