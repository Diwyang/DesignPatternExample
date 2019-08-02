package com.dj.designPattern.singleton.example1;

public class StaticBlockSingleton {

private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    
    public static void main(String[] args) {

    	StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
    	StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();

		print("s1", s1);
		print("s2", s2);
	}

	public static void print(String name, Object o) {
		System.out.println("Name : " + name + " and HashCode   " + o.hashCode());
	}

}
