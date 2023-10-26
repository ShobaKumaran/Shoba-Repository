package week1.day1;

/*Assignment 1: 

Goal: To understand the class, main method and sysout

a) Create a class by name: Browser
b) Create a main method using shortcut -> type main and press ctrl+space
c) print a statement --> "This is my Browser" -> type sysout and ctrl +space
d) run and confirm the printed in console
 */

public class Browser {
	
	public static void main(String[] args) {
		System.out.println("This is my Browser");
		
		//For Assignment 3
		Chrome brName = new Chrome(); //refer Chrome.java
		brName.getName();
		brName.PrintName();
	}

}
