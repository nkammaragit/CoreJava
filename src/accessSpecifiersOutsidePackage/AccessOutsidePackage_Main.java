package accessSpecifiersOutsidePackage;

import accessSpecifiers.AccessModifiers;

public class AccessOutsidePackage_Main {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		System.out.println(am.publicField);
		am.publicMethod();




	}
}
