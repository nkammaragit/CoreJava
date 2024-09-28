package constructers;

public class MainCarClass {
	
	public static void main(String [] args) {
		
		System.out.println("=========Toyota=========="); 
		
		Car toyota = new Car("Toyota","Innova",2023);
		toyota.displayInfo();
		
		System.out.println("========Tata===========");
		
		Car tata = new Car("Tata","Nexon",2024);
		tata.displayInfo();
		
		System.out.println("========mahindra===========");

		
		Car mahi = new Car("mahindra","XUV7oo",2024);
		mahi.displayInfo();
		
	}
	
	

}
