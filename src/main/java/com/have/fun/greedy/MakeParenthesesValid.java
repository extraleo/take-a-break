package com.have.fun.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * create on 19-10-24
 * LeetCode Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */
public class MakeParenthesesValid {
  public int minAddToMakeValid(String S) {
    if (S.length() == 1) {
      return 1;
    }

    ArrayList<Integer> list = new ArrayList();

    for (char i : S.toCharArray()) {
      if (i == '(') {
        list.add(0);
      }else {
        list.add(1);
      }
    }
    int min = list.size();
    int left=0;
    int right=1;
    while (left < list.size() ) {
      if (right == list.size()) {
        left++;
        right=left+1;
        continue;
      }
      if(list.get(left)==5){
        left++;
        continue;
      }
      if(list.get(left)==list.get(right)-1 ) {
        list.set(left, 5);
        list.set(right, 5);
        if(right-left == 1) {
          left = right + 1;
          right = left + 1;
        }else {
          left++;
          right++;
        }
        continue;
      }
      right++;
    }
    for (int i : list) {

      if(i==5){min--;}
    }
    return min;
  }

  public int minAddToMakeValidFastest(String S) {
    int left = 0, right = 0;
    for (int i = 0; i < S.length(); ++i) {
      if (S.charAt(i) == '(') {
        right++;
      } else if (right > 0) {
        right--;
      } else {
        left++;
      }
    }
    return left + right;
  }
}
