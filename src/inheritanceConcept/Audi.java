package inheritanceConcept;

public class Audi extends Car {

	@Override
	public void start() {
		
		System.out.println("Audi--child---start");
	}
	
	public void theftSafety() {
		
		System.out.println("Audi---child---theftSafety");
	}
	
}
