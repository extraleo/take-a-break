package com.have.fun.greedy;

import java.util.Arrays;

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
   * 这一题没有做出来.
   * 看了讨论区, 大致的思想是这样的:
   * 由于只能选择 -k 和 k, 那么在求差值的时候 如果 两个数都加了 k, 就等于没加;
   * 如果一个加了 k, 一个加了 -k, 那么在求差值的时侯, 小的那个就等于加了 2*k.
   * 所以 就可以 明确为 要么 +0 , 要么 +2K.
   * 首先:
   * 先排序, 排序之后 最大值和最小值分别就是 max=A[n-1], min=A[0], 那么现在 result = A[n-1] - A[0]
   * 现在从 0 开始遍历数组
   * min = min(A[0] + 2*K, A[i])
   * max = max(max, A[i]+2*k)
   * result = min(result, max-min)
   *
   */
  public int smallestRangeII(int[] A, int K) {
    Arrays.sort(A);
    int n = A.length, mx = A[n - 1], mn = A[0], res = mx - mn;
    for (int i = 0; i < n - 1; ++i) {
      mx = Math.max(mx, A[i] + 2 * K);
      mn = Math.min(A[i + 1], A[0] + 2 * K);
      res = Math.min(res, mx - mn);
    }
    return res;
  }
}
