package exceptions_UncheckedRuntime;

public class NumbformatExceptionTest {
	
	public static void main(String[] args) {
		
		String x = "raghu";
	
		try {
			int num = Integer.parseInt(x);
			System.out.println(num);

	     }
		
		catch(Exception a) {
			a.printStackTrace();
		}

	    System.out.println("calculation is done");
	
	}

}
