package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  /**
   * List interface.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    List lstnames = new ArrayList();
    lstnames.add("Anubhav");
    lstnames.add("Vinod");
    lstnames.add("Prem");
    lstnames.add("Raghu");
    lstnames.add("Sai");
    lstnames.add("Vishalakshi");
    System.out.println("Names are : ");
    // for (Object object : lstnames) {
    //System.out.println(object);
    //}
    System.out.println("JDk 1.8");
    lstnames.forEach(System.out::println);
    System.out.println();
    lstnames.forEach(System.err::println);
    System.out.println();
    lstnames.set(2, "Kumar");
    System.out.println("list after update");
    lstnames.forEach(System.out::println);
    System.out.println();
    lstnames.remove(1);
    System.out.println("list after removing");
    lstnames.forEach(System.out::println);
    System.out.println();
    lstnames.remove("Sai");
    lstnames.forEach(System.out::println);
    System.out.println();
    System.out.println("4th element " + lstnames.get(3));
  }
}
