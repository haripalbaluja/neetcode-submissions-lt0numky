class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        char[] array = s.toLowerCase().toCharArray();

        while(first < last) {
            while(first < last && !Character.isLetterOrDigit(array[first])) {
                first++;
            }

            while(first < last && !Character.isLetterOrDigit(array[last])) {
                last--;
            }
            if(array[first] != array[last]) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
