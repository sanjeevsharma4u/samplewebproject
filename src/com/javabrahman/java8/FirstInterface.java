package com.javabrahman.java8;
@FunctionalInterface
public interface FirstInterface {
 //the abstract method  
 public void singleMethod(String param);
 
 public static void main(String[] args) {
	 
	 FirstInterface instance = (String param) -> {System.out.println("My lambda says "+ param);};

 }
 
}