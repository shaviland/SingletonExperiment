package com.shaviland.app;

public class SingletonApp {

	public static void main(String[] args) {

		Singleton objA = Singleton.getInstance();
		Singleton objB = Singleton.getInstance();
		Singleton objC = Singleton.getInstance();

		objA.hello();

		objA.setData("Singletons occupy one location in memory");
		System.out.println(objA.getData());
		System.out.println(objB.getData());
		System.out.println(objC.getData());

		objB.setData("changing one object changes all");
		System.out.println(objA.getData());
		System.out.println(objB.getData());
		System.out.println(objC.getData());

		// three different objects call or set the different aspects of the same
		// instance of the singleton
		objC.setData("Taco Cat");
		String check = objC.getData();
		if (objA.palindromeChecker(objB.getData())) {
			System.out.println( check + " is a Palindrome based on the letters in the statment.");
		} else {
			System.out.println(check +" is not a Palindrome based on the letters in the statment.");
		}
	}

}
