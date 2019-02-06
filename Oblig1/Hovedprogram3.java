/* Oblig 1, IN1010 v-19, Nora Skjelstad */

import java.util.Scanner;

class Hovedprogram3{
	public static void main(String[] args) {
		/* Variabelen input tar inn filnavn fra bruker og setter det inn
		i konstruktøren når det opprettes en regneklynge kalt abel */
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn filnavn: ");
		String filnavn = input.nextLine();

		Regneklynge abel = new Regneklynge(filnavn);

		// Printer nødvendig informasjon og kaller på tilhærende metoder.
		System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne2(32));
		System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne2(64));
		System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne2(128));

		System.out.println("\nAntall prosessorer: " + abel.antProsessorer());
		System.out.println("Antall racks: " + abel.antRacks());
	}
}

