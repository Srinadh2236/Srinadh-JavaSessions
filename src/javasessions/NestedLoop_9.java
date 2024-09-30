package javasessions;

public class NestedLoop_9 {

	public static void main(String[] args) {

		// for
		// for

		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {
				// System.out.println(i+""+j + " ");//00 and space new line println
				System.out.print(i + "" + j + " ");// 00 and space 01 02 03 04 05 10 11 12 13 14 15 20 21.....55
													// i want new line every 5 so i am simply use println.
			}
			System.out.println();// new line for inner loop completion.
		}

		for (int a = 0; a <= 5; a++) {
			for (int b = 0; b <= 5; b++) {
				for (int c = 0; c <= 5; c++) {
					System.out.print(a + "" + b + "" + c + " ");
				}
				//break; inner loop will break.
			}

			System.out.println();

		}

	}

}
