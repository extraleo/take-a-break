package com.have.fun.array;

/**
 * create on 19-10-30
 * LeetCode link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 * merge sort?
 */
public class MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] num3 = new int[nums1.length + nums2.length];
    int max= Math.min(nums1.length, nums2.length);
    for (int i = 0; i < max; i++) {
      if(nums1[i]>=nums2[i]){
        num3[i*2+1]=nums1[i];
        num3[i*2]=nums2[i];
      }else {
        num3[i * 2 + 1] = nums2[i];
        num3[i * 2] = nums1[i];
      }
    }
    return 0;
  }
}
