package com.have.fun.greedy;

/**
 * create on 19-10-22
 * leetCode link: https://leetcode.com/problems/gas-station/
 */
public class GasStation {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int totalGas = 0;
    int totalCost = 0;
    int tank = 0;
    int start = 0;
    for (int i = 0; i < gas.length - 1; i++) {
      totalCost += cost[i];
      totalGas += gas[i];
      tank = tank + gas[i] - cost[i];
      if (tank < 0) {
        start = i + 1;
        tank = 0;
      }
    }
    if (totalCost > totalGas) {
      return -1;
    } else {
      return start;
    }
  }
}
