package com.have.fun.greedy;

public class RemoveKDigits {
  public String removeKDigits(String num, int k) {
    if (num.length() <= k) {
      return "0";
    }
    StringBuffer stringBuffer = new StringBuffer();
    int mn=num.charAt(0);
    int mnIndex=0;
    int zeroCun=0;
    for(int i =1; i<= k;i++){
      if (num.charAt(i) == 0) {
        zeroCun++;
      }
      if (num.charAt(i) < mn) {
        mn=num.charAt(i);
        mnIndex=i;
      }
    }
    if(zeroCun>0){
      stringBuffer.append(num.substring(k + zeroCun));
      System.out.println("first:"+stringBuffer.toString());
      for(int i=0;i<stringBuffer.length();i++){
        if(stringBuffer.charAt(i)!=0){
          return stringBuffer.toString();
        }
      }
      return "0";
    }

    stringBuffer.append(num.charAt(mnIndex));
    stringBuffer.append(num.substring(k+1));
    return stringBuffer.toString();
  }
}
