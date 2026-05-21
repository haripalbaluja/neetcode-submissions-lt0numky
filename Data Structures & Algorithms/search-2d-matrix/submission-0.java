class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] array = new int[matrix.length * matrix[0].length];
        int columnLength = matrix[0].length;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                array[i*columnLength+j] = matrix[i][j];
            }
        }

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
