package constructers;

public class Car {
	String make ;
	String model ;
	int year ;
	
//Default or no argument constructor
public Car() {
		
}


//Parameterized constructor
public Car(String mk,String md,int yr) {
	make = mk;
	model = md;
	year = yr;
}
	

	
public void displayInfo() {
		
		System.out.println( "make - " + make );
		System.out.println( "model - " + model );
		System.out.println( "year - " + year );


}

//public void displayInfo(String x) {
//	
//	System.out.println( "make - " + make );
//	System.out.println( "model - " + model );
//	System.out.println( "year - " + year );
//
//
//}
//
//public void displayInfo(String x,String y) {
//	
//	System.out.println( "make - " + make );
//	System.out.println( "model - " + model );
//	System.out.println( "year - " + year );
//
//
//}
	
	

}
