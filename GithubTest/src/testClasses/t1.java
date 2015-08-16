package testClasses;

public class t1 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordT1="t1";
		t2 tt2=new t2("Test",783);
		t3 tt3=new t3(wordT1);
		
		runTest(wordT1,tt2,tt3);
		
	}

	private static void runTest(String wordT1, t2 tt2, t3 tt3) {
		System.out.println(wordT1+" = "+tt3.wordT3);
		System.out.println("------------------------------------");
		System.out.println(tt2.wordT2+" "+tt2.num+"!!!!!!");
		
	}

}
