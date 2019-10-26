package com.have.fun.greedy;

/**
 * create on 19-10-25
 */
public class SmallestRange {
  /**
   * LeetCode Link: https://leetcode.com/problems/smallest-range-i/
   */
  public int smallestRangeI(int[] A, int K) {
    int min = A[0];
    int max = A[0];
    for (int i = 1; i < A.length; i++) {
      if (A[i] > max) {
        max=A[i];
      }
      if(A[i]<min)
        min = A[i];
    }
    if (min + K >= max - K) {
      return 0;
    }
    return max-min-K-K;
  }

  /**
   * LeetCode Link: https://leetcode.com/problems/smallest-range-ii/
   */
  public int smallestRangeII(int[] A, int K) {
    int min = A[0];
    int max = A[0];
    for (int i = 1; i < A.length; i++) {
      if (A[i] > max) {
        max=A[i];
      }
      if(A[i]<min)
        min = A[i];
    }
    for (int i = 0; i < A.length; i++) {
      if (A[i] <= max) {
        A[i]=A[i]+i;
      }else {
        A[i]=A[i]-i;
      }
    }
    return max-min;
  }
}
