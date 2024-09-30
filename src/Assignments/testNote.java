package Assignments;

public class testNote {

	public static void main(String[] args) {

		String evenNumberList = "";

		for (int c = 1; c <= 100; c++) {

			if (c % 2 == 0) {
				evenNumberList = (evenNumberList + c + ",");
			}
		}

		System.out.println(evenNumberList);

	}

}
