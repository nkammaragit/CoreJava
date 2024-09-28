package variables_Methods;

public class VaraiblesAndMethods {

	int instanceVariable =20;  // nonstatic or  instance variable 
	static int staticVaraible =10;
	public static void main(String[] args) {
		//Access instance method and instance variable
		VaraiblesAndMethods vam = new VaraiblesAndMethods();
		vam.instanceMethod();
		System.out.println("instanceVariable : " + vam.instanceVariable);
		
		// Access static method and static variable 
		VaraiblesAndMethods.staticMethod();
		System.out.println("Static Varaible : " + VaraiblesAndMethods.staticVaraible);
	}

	//non static or instance method
	public void instanceMethod() {
		 int k = 100;
		System.out.println("In instance");	
		System.out.println("Local variable k : " + k);	
	}
	//static method
	public static void staticMethod() {

		System.out.println("In StaticMethod");		
	}


}
