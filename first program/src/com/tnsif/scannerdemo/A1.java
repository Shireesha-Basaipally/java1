package com.tnsif.scannerdemo;

public class A1 {
	    void methodA() {
	        System.out.println("Class A1 method");
	    }
	}

	
	class B1 extends A1 {
	    void methodB() {
	        System.out.println("Class B1 method");
	    }
	}

	
	class C extends A1 {
	    void methodC() {
	        System.out.println("Class C method");
	    }
	}

	
	class D extends B1 {
	    void methodD() {
	        System.out.println("Class D method");
	    }
	}
	

	
	

