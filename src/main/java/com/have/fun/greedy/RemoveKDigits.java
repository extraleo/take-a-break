package com.have.fun.greedy;

import java.util.Stack;

/**
 * create on 19-10-27
 * LeetCode link: https://leetcode.com/problems/remove-k-digits/
 *
 * 这道题做的心情很复杂, 基本上想的思路都是有问题的.
 * 看了讨论区的做法.
 * 中心思想就是尽可能移除高位K个最大的数,使数字变小. [我第三个思路就是往这边想的, 因为前一个死在了 112,1 上.但是没想到用stack 做辅助.]
 */
public class RemoveKDigits {
  public String removeKDigits(String num, int k) {
    if (k == num.length()) {
      return "0";
    }
    Stack<Character> stack=new Stack<Character>();
    int i=0;
    int length = num.length();

    while (i < length) {
      while (k > 0 && !stack.empty() && stack.peek() > num.charAt(i)) {
        stack.pop();
        k--;
      }
      stack.push(num.charAt(i));
      i++;
    }
    // "11111"
    while (k > 0) {
      stack.pop();
      k--;
    }
    StringBuilder builder = new StringBuilder();
    while (!stack.isEmpty()) {
      builder.append(stack.pop());
    }
    // 翻转
    builder.reverse();
    //remove all the 0 at the head
    while(builder.length()>1 && builder.charAt(0)=='0')
      builder.deleteCharAt(0);
    return builder.toString();
  }
}
