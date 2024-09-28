package dataTypes_Operators;

//Class
public class DataTypesPractice {

	String y = "Indra";
	String yy = "Indra2";
	String a = "Raghu";
	String h = "Hari";
	String p = "Prutvi";
	
	int xx= 10;
	int yyy= 10;
	int zz= 10;
	int kk= 10;
	
	
	
	




	
	//Variable declaration
	int z ;
	// variable initialization
	int x= 10;
	byte b = 127;
	short s = 32767; //-32768  to 32768
	int i= 2147483647;
	long l = 92233720;
	float f=  3.5674F; 
	double d= 1.7976931348623157E308d;
	boolean k = false;
	char c = 'f';
	static int m = 10;
	int value_int = 20;

	//Main method - Entry point
	public static void main(String[] args) {
		int f = 10;
		int g = 20;
		
		// Assignment operator =
		System.out.println( f = g);
		
		//Equality operator
		boolean result = (f == g) ;
		
//		System.out.println( f == g);
		
		System.out.println("result :" + result);
		
		
		
		//create an instance to class
		DataTypesPractice dtp=new DataTypesPractice();
		System.out.println(dtp.y + dtp.yy);
		
	//Access instance variable	
	//System.out.println("dtp i value : " + dtp.i);
		
	
		
	//print local variable 	
	//System.out.println("f value : " + f);
	
		
		
//		System.out.println("Hello world");
//		System.out.print(x);
		

	}































	//Method
	public void addition(String x, String y) {
		System.out.println("Addition");
	}

	//Method
	public void sub(String x, String y) {
		System.out.println("Addition");
	}

	//Method
	public void mul() {
		System.out.println("Addition");
	}

	//Method
	public void div() {
		System.out.println("Addition");
	}




}
