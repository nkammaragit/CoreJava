package misc;

public class MyTest {
int inti;
String strJ;
Integer integerk;
static int stInt;

	public static void main(String[] args) {
		MyTest mt = new MyTest();
      System.out.println(mt.inti);
      System.out.println(mt.strJ);
      System.out.println(mt.integerk);
      System.out.println(stInt);
      
      mt.test();
	}
	
	public void test() {
		int x ;
		 System.out.println(inti);
	      System.out.println(strJ);
	      System.out.println(integerk);
	      System.out.println(stInt);
	}

}
