package com.dj.designPattern.singleton.example1;

class Singleton{
	
	public static Singleton ins = new Singleton();
	
	private Singleton() {}	
	
	public static Singleton getInstance() {
		return ins;
	}
}
public class SingletonDesignPatternExample1 {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("s1",s1);
		print("s2",s2);
	}
	
	public static void print(String name, Object o){
		
		System.out.println("Name : "+name +" and HashCode   "+o.hashCode());
		
	}

}
