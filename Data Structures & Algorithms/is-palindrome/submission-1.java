class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        char[] arr = s.toCharArray();

        while(low < high) {
            if(!Character.isLetterOrDigit(arr[low])) {
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(arr[high])) {
                high--;
                continue;
            }
            if(Character.toLowerCase(arr[low]) != Character.toLowerCase(arr[high])) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
