package polymorphism;

public class OverridingSubclass extends OverridingSuperClass {
	
//	@Override
//	public void add(int x, int y) {
//		System.out.println(x + y * 2);
//	}
	
	public static void main(String args[]) {
		
		OverridingSubclass osub = new OverridingSubclass();
		osub.add(5, 6);
		
	}

}
