package com.dj.designPattern.singleton.example6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singleton implements Cloneable {

	public static Singleton ins = null;

	private Singleton() {
	}

	// Lazy initialiazation
	public static Singleton getInstance() {
		if (ins == null) {
			synchronized (Singleton.class) {
				if (ins == null) {
					ins = new Singleton();
				}

			}

		}
		return ins;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
public class SingletonDesignPatternExample6  {
	
	static void useSingleton() {
		Singleton singleton = Singleton.getInstance();
		print("Singleton",singleton);
	}

	public static void main(String[] args) throws Exception{
		
		//Voilation trough Multithreaded , some till will work 		
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(SingletonDesignPatternExample6::useSingleton);
		service.submit(SingletonDesignPatternExample6::useSingleton);
		service.shutdown();
	}
	
	public static void print(String name, Object o){
		
		System.out.println("Name : "+name +" and HashCode   "+o.hashCode());
		
	}

}
