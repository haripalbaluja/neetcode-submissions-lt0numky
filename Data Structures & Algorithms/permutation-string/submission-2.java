class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String s1word = new String(s1Array);

        for(int i = 0; i < s2.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < s2.length(); j++) {
                sb.append(s2.charAt(j));
                char[] s2Array = sb.toString().toCharArray();
                Arrays.sort(s2Array);
                String s2word = new String(s2Array);
                if(s1word.equals(s2word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
