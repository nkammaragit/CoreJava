package polymorphism;

public class Overloading {
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	
	
	public void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	public void add(String x, String y) {
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		
		ol.add(3, 5);
		
		ol.add(3, 5, 6);
		
		ol.add("Indra", " Kumar");

	}

}
