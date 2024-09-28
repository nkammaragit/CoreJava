package variables_Methods;

public class CallOtherClass {

	public static void main(String[] args) {
		
		//Accessing instance variable and method
		VaraiblesAndMethods vam2 = new VaraiblesAndMethods();
		vam2.instanceMethod();
		System.out.println(vam2.instanceVariable);
		
		//Accessing static variable and methods
		VaraiblesAndMethods.staticMethod();
		System.out.println(VaraiblesAndMethods.staticVaraible);

		
		
		
		
		
		
		
		
		

	}
	
	
	

}

