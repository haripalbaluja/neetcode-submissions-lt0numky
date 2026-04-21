class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        int[] res = new int[] {-1, -1};
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> countS = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j), 0) + 1);
                boolean flag = true;
                for (char c : countT.keySet()) {
                    Integer countInS = countS.getOrDefault(c, 0);
                    if (countInS < countT.get(c)) {
                        flag = false;
                        break;
                    }
                }
                if (flag && (j - i + 1) < minLen) {
                    res[0] = i;
                    res[1] = j;
                    minLen = j - i + 1;
                }
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(res[0], res[1] + 1);
        }
    }
}
