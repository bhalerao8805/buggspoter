package methods01;

public class REVlen {
	public static void Revmetgod() {
		String S = "Saurabh";

		for (int i = S.length() - 1; i >= 0; i--) {
			System.out.print(S.charAt(i));
		}
	}
	//---------------------------------------------------------
	
	
			// Function to demonstrate printing pattern
			public static void printStars(int n)
			{
				int i, j;

				// outer loop to handle number of rows
				// n in this case
				for(i=0; i<n; i++)
				{

					// inner loop to handle number of columns
					// values changing acc. to outer loop
					for(j=0; j<=i; j++)
					{
						// printing stars
						System.out.print("* ");
					}

					// ending line after each row
					System.out.println();
				}
		}

//			// Driver Function
//			public static void main(String args[])
//			{
//				int n = 5;
//				printStars(n);
//			}
//		}

	

	public static void revlength() {
		int a = 648;

		int rm;
		int rev = 0;

		while (a != 0) {
			rm = a % 10;
			rev = rev * 10 + rm;
			a = a / 10;
		}
		System.out.println(rev);
	}
	
	//-------------------------------------------------------

	public static void leapyear() {
		int year = 2012;
		if (year % 4 == 0) {
			System.out.println("this is leap year");
		} else {
			System.out.println("this is not a leap year");
		}

	}

	public static void main(String[] args) {

//		REVlen.Revmetgod();
//		System.out.println();
//		REVlen.leapyear();

//		REVlen.revlength();
//
//int n=5;
//
//		for (int i = 0;i<n;i++) {
//			
//			for (int j;j<=i;j++) {
//				System.out.print("* ");
//
//			}
//			System.out.println();
		}

	}

