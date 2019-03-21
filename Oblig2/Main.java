// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad 

public class Main{
	public static void main(String[] args) {
		// Integrasjonstest med informasjon hentet fra innleveringens vedlegg.

// ----- Preparater:
		System.out.println("---- PreparatA ----");
		PreparatA prepA = new PreparatA("Predizol", 450.0, 75, 8);
		System.out.println(prepA);

		System.out.println("\n---- PreparatB ----");
		PreparatB prepB = new PreparatB("Paralgin Forte", 65.0, 400.0, 5);
		System.out.println(prepB);

		System.out.println("\n---- PreparatC ----");
		PreparatC prepC1 = new PreparatC("Ibux", 240.0, 200);
		// Med prepC2 vil vi se at ID-systemet fungerer.
		PreparatC prepC2 = new PreparatC("Placebo Pianissimo", 10.0, 0);
		System.out.println(prepC1);
		System.out.println(prepC2);

// ------ Resepter: 

		Lege cox = new Lege("Dr. Cox");
		Lege wilson = new Lege("Dr. Wilson");
		Lege house = new Spesialist("Dr. House", 12345);
		Lege lovold = new Lege("Dr. Hillestad Lovold");

		System.out.println("\n---- Blå resept ----");
		Blaaresept blaa = new Blaaresept(prepC1, cox, 2, 3);
		System.out.println(blaa);


		System.out.println("\n---- Millitærresept ----");
		Hvitresept millR = new MillResept(prepB, lovold, 3, 10000);
		System.out.println(millR);

		System.out.println("\n---- P-resept ----");
		Hvitresept pres = new Presept(prepA, house, 1);
		System.out.println(pres);

// ------ UlovligUtskrift;
		System.out.println("\n---- Når en lege ikke får skrive ut resept ----");

		try{
			wilson.skrivResept(prepA, 3, 7);
		}catch(UlovligUtskrift e){
			System.out.println(e);
		}
		
	}
}