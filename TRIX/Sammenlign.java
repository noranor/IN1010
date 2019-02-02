import java.util.Scanner;

class Sammenlign{
	int a;
	int b;

	 public static void main(String[] args) {
	 	
		Scanner input1 = new Scanner(System.in);
		System.out.println("Skriv inn ett tall:");
		int a = input1.nextInt();

		Scanner input2 = new Scanner(System.in);
		System.out.println("Skriv inn ett tall: ");
		int b = input2.nextInt();

		if(a < b ){
			System.out.println("b er større enn a");
		}

		if(b < a ){
			System.out.println("a er større enn b");
		} 
	}
}