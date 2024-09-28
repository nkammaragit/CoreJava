package exceptions_UncheckedRuntime;

public class NullPointerExceptionTest {
	
	public static void main(String[] args) {
		
		String name = null;
		
		
		try {
			int lenth = name.length();	    
		}
		
		catch(Exception a) {
			a.printStackTrace();
		}
	   
		System.out.println("control came here");
	
	}

}
