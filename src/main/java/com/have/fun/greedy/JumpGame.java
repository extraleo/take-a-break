package com.have.fun.greedy;

/**
 * create on 20191021
 * 贪心算法
 * leetcodeLink: https://leetcode.com/problems/jump-game/
 */
public class JumpGame {
  // jump game 1
  public boolean canJump(int[] nums) {
    int reach = nums[0];
    for (int i = 1; i < nums.length && i <= reach; i++) {
      if (nums[i] + i > reach)
        reach = nums[i] + i;
    }
    return reach >= nums.length - 1;

  }

  /**
   * jump game 2
   * https://leetcode.com/problems/jump-game-ii/discuss/18014/Concise-O(n)-one-loop-JAVA-solution-based-on-Greedy
   *
   * 这个解法的有意思的是: 计数的条件.
   * Let's say the range of the current jump is [curBegin, curEnd]
   * curFarthest is the farthest point that all points in [curBegin, curEnd] can reach.
   * Once the current point reaches curEnd, then trigger another jump: [curEnd, curFarthest]
   * and set the new curEnd with curFarthest, then keep the above steps
   */
  public int canJump2(int[] nums) {
    int jumps = 0, curEnd = 0, curFarthest = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      curFarthest = Math.max(curFarthest, i + nums[i]);
      if (i == curEnd) {
        jumps++;
        curEnd = curFarthest;
        if (curEnd >= nums.length - 1) {
          break;
        }
      }
    }
    return jumps;
  }
}
