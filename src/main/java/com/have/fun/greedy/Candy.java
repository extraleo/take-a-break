package com.have.fun.greedy;

/**
 * create on 19-10-23
 * LeetCode Link: https://leetcode.com/problems/candy/
 */
public class Candy {
  public int minCandy(int[] nums){
    int[] candy=new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if(i==0){
        candy[i]=1;
        continue;
      }
      if(nums[i]==0) {
        candy[i] = 1;
      }
      if(nums[i]>nums[i-1]){
        candy[i]=candy[i-1]+1;
      }else{
        candy[i]=1;
      }
    }

    for (int i = nums.length-1; i > 0; i--) {
      if(nums[i-1]>nums[i] && candy[i-1]<=candy[i]){
        candy[i-1]=candy[i]+1;
      }
    }

    int minCandy=0;
    for (int value : candy) {
      minCandy = minCandy + value;
    }
    return minCandy;
  }
}
