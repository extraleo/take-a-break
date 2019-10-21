package com.have.fun;

/**
 * create on 20190102
 * 贪心算法
 * leetcodeLink: https://leetcode.com/problems/jump-game/
 */
public class JumpGame{
  // jump game 1
    public boolean canJump(int[] nums) {
      int reach=nums[0];
      for(int i=1; i< nums.length && i<=reach;i++){
        if(nums[i] + i> reach)
          reach=nums[i] + i;
      }
      return reach >= nums.length-1;

    }

    // jump game 2
  public boolean
  }
