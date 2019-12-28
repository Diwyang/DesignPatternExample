package org.principles.lsp.example2;

class Graph2D {
	 
	public void draw(int x, int y){
		System.out.println("drawing a 2D co-ordinate");
	}
}

class Graph3D extends Graph2D{
	 
	public void draw(int x, int y, int z){
		System.out.println("drawing a 3D co-ordinate");
	}
	
}

class Graph3DD{
	 
	private Graph2D graph2d = new Graph2D();	
	public void draw(int x, int y, int z){
		graph2d.draw(x, y);
		System.out.println("drawing a 3D co-ordinate");
	}
	
}

public class LspDemo {
	 
	public static void main(String[] args) {
 
		Graph3D graph = new Graph3D();
		graph.draw(4, 4, 5);
		
		System.out.println("----- solving violation of liskov substitution principle -----");
		
		Graph3DD graph3D = new Graph3DD();
		graph3D.draw(4, 4, 5);
 
	}
 
}