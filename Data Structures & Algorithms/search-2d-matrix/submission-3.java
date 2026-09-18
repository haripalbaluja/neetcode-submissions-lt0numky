class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int height = matrix.length;
        int width = matrix[0].length;
        
        for(int i = 0; i < height; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][width-1]) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public boolean binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;

        while(low <= high) {
            int mid = (low+high)/2;
            if(array[mid] == target) {
                return true;
            }
            else if(array[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}
