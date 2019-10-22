package com.have.fun.simple;

import java.util.HashMap;

public class Duplicate {
  public int findDuplicate(int[] nums) {
    HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    for (int i = 0; i < nums.length - 1; i++) {
      if(map.get(nums[i])==null){
        map.put(nums[i], true);
        continue;
      }
      if(map.get(nums[i])) {
        return nums[i];
      }
    }
    return nums[nums.length - 1];
  }
}
