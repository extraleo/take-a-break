package com.have.fun.simple;

/**
 * 这个东西只是写着用来看java 是引用传递还是值传递
 * 其实已经有很多 指南 写了说 java 是 值传递, 没有所谓的引用传递,
 * 其实这就是个怪圈.
 * 我们通常理解的就是, 一个方法, 我传个对象进去, 改变对象的值, 然后不返回
 * 跑完这个函数之后, 此对象的值改变了吗? 改变了, 但是要注意这种操作只是存在于对象
 * 不要想着 **primitive** 以及 **String** 也能套进来
 */
public class PassVauleOrPassReference {
  public static void main(String[] args) {
    Bcd bcd = new Bcd();
    bcd.setStr("Init value");
    Abc abc = new Abc();
//    abc.setBcd(bcd);
    System.out.println("First print: "+abc.getBcd());
    changeStr(abc);
    System.out.println("Second print: "+abc.getBcd());
    printIt(abc);
  }

  public static void printIt(Abc abc) {
    System.out.println("Third print: "+abc.getBcd());
  }
  public static void changeStr(Abc abc){
    Bcd bcd = new Bcd();
    bcd.setStr("changed it");
    abc.setBcd(bcd);
  }
  public static class Abc{
    Bcd bcd;

    public Bcd getBcd() {
      return bcd;
    }

    public void setBcd(Bcd bcd) {
      this.bcd = bcd;
    }
  }
  public static class Bcd{
    String str;

    public String getStr() {
      return str;
    }

    public void setStr(String str) {
      this.str = str;
    }
  }
}
