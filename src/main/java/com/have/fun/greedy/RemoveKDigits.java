package com.have.fun.greedy;

public class RemoveKDigits {
  public String removeKdigits(String num, int k) {
    if (num.length() <= k) {
      return "0";
    }
    StringBuffer stringBuffer = new StringBuffer();
    if (num.charAt(0) == '1' && num.charAt(1) !='0') {
      stringBuffer.append(num.charAt(0));
      stringBuffer.append(num.substring(k));
    }else {
      for(int i=0;i<num.length();i++){

      }
    }
    return stringBuffer.toString();
  }
}
