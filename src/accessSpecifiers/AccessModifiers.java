package accessSpecifiers;

public class AccessModifiers {

	//Variables
	public int publicField = 10;
	protected int protectedField = 20;
	int defaultField = 30;
	private int privateField= 40;

	//Methods
	public void publicMethod() {
		System.out.println("publicMethod");
		System.out.println(privateField);
	}
	protected void protechedMethod() {
		System.out.println("protechedMethod");
		System.out.println(privateField);
	}
	void defaultMethod() {
		System.out.println("defaultMethod");
	}
	private void privateMethod() {
		System.out.println("privateMethod");
	}




}
