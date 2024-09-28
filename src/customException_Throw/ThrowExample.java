package customException_Throw;

public class ThrowExample {
	
	

	public void voteEligibility(int intAge) {
		
		//int age=intAge;
		if(intAge < 18){
			
		throw new MyException("Not eligible to vote") 	;

		} 
		else {
			System.out.println("you are eligible to vote");
		}

	}
	
	

}
