class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            s1freq[s1.charAt(i)-'a']++;
            s2freq[s2.charAt(i)-'a']++;
        }

        int matches = 0;

        for(int i = 0; i < 26; i++) {
            if(s1freq[i] == s2freq[i]) {
                matches++;
            }
        }

        int l = 0;

        for(int r = s1.length(); r < s2.length(); r++) {

            if(matches == 26) {
                return true;
            }
            int addIndex = s2.charAt(r) - 'a';
            s2freq[addIndex]++;
            if(s1freq[addIndex] == s2freq[addIndex]) {
                matches++;
            } else if(s1freq[addIndex] + 1 == s2freq[addIndex]) {
                matches--;
            }

            int removeIndex = s2.charAt(l) - 'a';
            s2freq[removeIndex]--;
            if(s2freq[removeIndex] == s1freq[removeIndex]) {
                matches++;
            } else if(s1freq[removeIndex] == s2freq[removeIndex]+1) {
                matches--;
            }
            l++;
        }
        return matches == 26;


    }
}
