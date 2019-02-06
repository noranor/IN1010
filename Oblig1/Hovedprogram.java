/* Oblig 1, IN1010 v-19, Nora Skjelstad */

import java.util.Scanner;

class Hovedprogram{
	public static void main(String[] args) {
		/* Kjører metoder som igangsetter helholdsvis deloppgave D og 
		deloppgave E. */
		System.out.println("_____DEL D______");
		delD();
		System.out.println("_____DEL E______");
		delE();

	}

	public static void delD(){
		// Oppretter regneklynge kalt abel.
		Regneklynge abel = new Regneklynge(12);

		/* Genererer 650 noder med 64 GB minne og 1 prosessor. 
		Setter så disse nodene inn i regneklynge. */
		for(int i = 0; i < 650; i++){
			Node node1 = new Node(64, 1);			
			abel.settInnNode2(node1);
		}
		/* Genererer 16 noder med 1024 GB minne og 2 prosessorer. 
		Setter så disse nodene inn i regneklynge. */
		for(int i = 0; i < 16; i++){
			Node node2 = new Node(1024, 2);
			abel.settInnNode2(node2);
		}

		// Printer nødvendig informasjon og kaller på tilhærende metoder.
		System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne2(32));
		System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne2(64));
		System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne2(128));

		System.out.println("\nAntall prosessorer: " + abel.antProsessorer());
		System.out.println("Antall racks: " + abel.antRacks());
		System.out.println();
	}

	public static void delE(){
		/* Variabelen input tar inn filnavn fra bruker og setter det inn
		i konstruktøren når det opprettes en regneklynge kalt abel */
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn filnavn: ");
		String filnavn = input.nextLine();
		System.out.println();

		Regneklynge abel = new Regneklynge(filnavn);

		// Printer nødvendig informasjon og kaller på tilhærende metoder.
		System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne2(32));
		System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne2(64));
		System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne2(128));

		System.out.println("\nAntall prosessorer: " + abel.antProsessorer());
		System.out.println("Antall racks: " + abel.antRacks());
	}
}


