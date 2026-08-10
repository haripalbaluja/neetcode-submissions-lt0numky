class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1freq[s1.charAt(i) - 'a']++;
            s2freq[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1freq[i] == s2freq[i]) {
                matches++;
            }
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) {
                return true;
            }

            int indexToAdd = s2.charAt(r) - 'a';
            s2freq[indexToAdd]++;
            if (s1freq[indexToAdd] == s2freq[indexToAdd]) {
                matches++;
            } else if (s1freq[indexToAdd] + 1 == s2freq[indexToAdd]) {
                matches--;
            }

            int indexToRemove = s2.charAt(l) - 'a';
            s2freq[indexToRemove]--;
            if (s1freq[indexToRemove] == s2freq[indexToRemove]) {
                matches++;
            } else if (s1freq[indexToRemove] - 1 == s2freq[indexToRemove]) {
                matches--;
            }
            l++;
        }
        return matches == 26;
    }
}
