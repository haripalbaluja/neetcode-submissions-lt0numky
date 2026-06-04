class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        // required indices for median calculation
        int count = 0;
        int index1 = n / 2;
        int index2 = index1 - 1;
        int index1El = -1;
        int index2El = -1;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (count == index1) {
                    index1El = nums1[i];
                }
                if (count == index2) {
                    index2El = nums1[i];
                }
                count++;
                i++;
            } else {
                if (count == index1) {
                    index1El = nums2[j];
                }
                if (count == index2) {
                    index2El = nums2[j];
                }
                count++;
                j++;
            }
        }

        while (i < n1) {
            if (count == index1) {
                index1El = nums1[i];
            }
            if (count == index2) {
                index2El = nums1[i];
            }
            count++;
            i++;
        }

        while (j < n2) {
            if (count == index1) {
                index1El = nums2[j];
            }
            if (count == index2) {
                index2El = nums2[j];
            }
            count++;
            j++;
        }

        if (n % 2 == 1) {
            return (double) index1El;
        }

        return (index1El + index2El) / 2.0;
    }
}
