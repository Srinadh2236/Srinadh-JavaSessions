package Interface;

public class Hospital implements germany {


	//germany interface parent
	//hospital is class child
	//test class is called id with main method
	
	static final int examFee = 666;

	@Override
	public void germanMedical() {

		System.out.println("Germany --- medical --- services");

	}

	public static void germanOrtho() {
		System.out.println("GermanOrtho--method hifing ");
	}
//
//	@Override
//	public void germanNuro() {
//
//		System.out.println("Gemnam---Nuro__");
//	}

	@Override
	public void parentMedical() {
		System.out.println("German-- paranent ");
	}
}
