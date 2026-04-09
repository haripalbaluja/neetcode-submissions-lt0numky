class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        char[] array = s.toCharArray();

        while(low < high) {
            if(!Character.isLetterOrDigit(array[low])) {
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(array[high])) {
                high--;
                continue;
            }
             if(Character.toLowerCase(array[low]) != Character.toLowerCase(array[high])) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
