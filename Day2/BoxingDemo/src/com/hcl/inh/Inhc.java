package com.hcl.inh;
class First{
	static{
		System.out.println("base class static");
	}
	public First(){
		System.out.println("Base class constructor");
	}
}
class Second extends First{
	static{
		System.out.println("Derived class static");
	}
	public Second(){
		System.out.println("Derived class constructor");
	}
}
public class Inhc {
	public static void main(String[] args) {
		new Second();
	}

}
