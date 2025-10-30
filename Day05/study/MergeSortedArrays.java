package study;


import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};

        int[] merged = mergeArrays(nums1, nums2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < n1) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }
}
