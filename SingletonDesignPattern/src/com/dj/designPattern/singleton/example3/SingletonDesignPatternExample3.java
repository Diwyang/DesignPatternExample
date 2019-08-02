package com.dj.designPattern.singleton.example3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable{
	
	public static Singleton ins = new Singleton();
	
	private Singleton() {}	
	
	public static Singleton getInstance() {
		return ins;
	}
}
public class SingletonDesignPatternExample3  {

	public static void main(String[] args) throws Exception{
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("s1",s1);
		print("s2",s2);
		
		//Voilation through serilization/Deserialization
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Work\\ser.sr"));
		os.writeObject(s2);
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Work\\ser.sr"));
		Singleton s3 = (Singleton)is.readObject();
		print("s3",s3);
	}
	
	public static void print(String name, Object o){
		
		System.out.println("Name : "+name +" and HashCode   "+o.hashCode());
		
	}

}
