package accessSpecifiers;

public class AccessInsidePackage_Main {
	public static void main(String[] args) {
		AccessModifiers am= new AccessModifiers();
		System.out.println(am.publicField);
		System.out.println(am.protectedField);
		System.out.println(am.defaultField);
		
		am.publicMethod();
		am.protechedMethod();
		am.defaultMethod();
			
	
	}
}
