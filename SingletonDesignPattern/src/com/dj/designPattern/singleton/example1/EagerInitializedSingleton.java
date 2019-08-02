package com.dj.designPattern.singleton.example1;


public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

	public static void main(String[] args) {

		EagerInitializedSingleton s1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton s2 = EagerInitializedSingleton.getInstance();

		print("s1", s1);
		print("s2", s2);
	}

	public static void print(String name, Object o) {

		System.out.println("Name : " + name + " and HashCode   " + o.hashCode());

	}
}
