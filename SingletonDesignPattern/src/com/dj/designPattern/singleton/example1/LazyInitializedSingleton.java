package com.dj.designPattern.singleton.example1;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

	public static void main(String[] args) {

		LazyInitializedSingleton s1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton s2 = LazyInitializedSingleton.getInstance();

		print("s1", s1);
		print("s2", s2);
	}

	public static void print(String name, Object o) {
		System.out.println("Name : " + name + " and HashCode   " + o.hashCode());
	}

}
