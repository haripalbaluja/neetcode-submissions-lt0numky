class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] array1 = s1.toCharArray();
        Arrays.sort(array1);
        String sortedWord = new String(array1);

        for(int i = 0; i < s2.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < s2.length(); j++) {
                sb.append(s2.charAt(j));
                char[] array2 = sb.toString().toCharArray();
                Arrays.sort(array2);
                String sortedWord2 = new String(array2);
                if(sortedWord.equals(sortedWord2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
