/* Oblig 1, IN1010 v-19, Nora Skjelstad */

class Hovedprogram2{
	public static void main(String[] args) {
		// Oppretter en regneklynge med en fil med informasjon i konstruktøren 
		Regneklynge abel = new Regneklynge("regneklynge2.txt");

		// Printer nødvendig informasjon og kaller på tilhærende metoder.
		System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne2(32));
		System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne2(64));
		System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne2(128));

		System.out.println("\nAntall prosessorer: " + abel.antProsessorer());
		System.out.println("Antall racks: " + abel.antRacks());
	}
}

