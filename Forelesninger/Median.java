	/* Et program som finner medianen av en liste
som inneholder tall */

import java.io.File; // Klasse fra biblioteket som definerer en fil
import java.util.Arrays; // Klasse fra biblioteket som henter inn funksjoner til arrays/lister
import java.util.Scanner; // Klasse fra biblioteket som tar inn input


class Median{

	private static int finnMedian(int[] a){
		Arrays.sort(a); // Sorterer listen. Metode fra class Arrays
		return a[1];
	}

	public static void main(String[] args) { 
		int[] data = new int[3]; // Deklarerer 3 indekser i listen
		Scanner fil = null;

		try{ // Sikkerhet, vi skal forsøke å gjøre noe, men det kan gå galt
			fil = new Scanner(new File("tall.data")); // Tar inn filen som parameter i Scanner
		} catch (Exception e){ // Hvis en feil skjer - e = generell kommando
			System.exit(1); // Avslutter hele kjøringen
			system.out.println("Finner ikke tall.data")
		}
		for (int i = 0; i < 3; i++){ 
			data[i] = fil.nextInt(); 

			} // .nextInt() er det samme som .readline()
		// (Initiering; test; inkrementering) - Int i skal bare være tilgjengelig innenfor krøllparentesene. Etter løkken er ferdig vil int i fjernes
		/* Kan også skrives som..
		int i = 1;
		while (i <= 10){}
		*/
		System.out.println("Medianen er " + finnMedian(data)); /* Hver gang man sender en parameter, så tar man en 
		 kopi av parameteren og sender den over. Sender kopi ac referansen til arrayen, men det er likevel selve
		 arrayen vi jobber med */
	}
}
/* 
Array : Samling elementer av samme type 

*/