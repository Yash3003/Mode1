package com.hcl.collections;

import java.util.Scanner;

public class Scan1 {
  /**
   * Scanner class.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    System.out.println("Enter your name : ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("name is : " + name);
  }
}
