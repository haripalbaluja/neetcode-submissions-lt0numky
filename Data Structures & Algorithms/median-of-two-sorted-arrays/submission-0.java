class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //length 0 check to add
        if(nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        int[] newNums = new int[nums1.length + nums2.length];
        int length = newNums.length;
        for(int i = 0; i < nums1.length; i++) {
            newNums[i] = nums1[i];
        }
        int tempLength = nums1.length;
        for(int i = 0; i < nums2.length; i++) {
            newNums[i+ tempLength] = nums2[i];
        }

        List<Integer> list = new ArrayList<>();
        for(int num : newNums) {
            list.add(num);
        }
        Collections.sort(list);
        
        for(int i = 0; i < length; i++) {
            newNums[i] = list.get(i);
        }

        double median = 0;
        if(length % 2 != 0) {
            median = newNums[length/2];
        } else {
            median = (newNums[length/2] + newNums[length/2-1])/2.0;
        }
        return median;

    }
}
