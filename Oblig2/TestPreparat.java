// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

class TestPreparat{
	public static void main(String[] args) {

		// Oppretter variabler for å brukes i PreparatA-objekt og i tester.
		String navnA = "Paracet";
		double prisA = 109.0;
		double virkestoff = 4.3;
		int styrke = 4;

		PreparatA prepA = new PreparatA(navnA, prisA, virkestoff, styrke);

// ----- Tester PreparatA-klassen
		assert(prepA.hentNarkotiskStyrke() == styrke);
		assert(prepA.hentNavn() == navnA);
		assert(prepA.hentPris() == prisA);

		// Oppretter variabler for å brukes i PreparatB-objekt og i tester.
		String navnB = "Ibux";
		double prisB = 89.0;
		double virkestoffB = 2.1;
		int styrkeB = 7;

		PreparatB prepB = new PreparatB(navnB, prisB, virkestoffB, styrkeB);

// ----- Tester PreparatB-klassen
		assert(prepB.hentVaneStyrke() == styrkeB);
		assert(prepB.hentNavn() == navnB);
		assert(prepB.hentPris() == prisB);

// ----- Test for å se hvordan output i terminal blir etter toString()-override.

		System.out.println("_____PREPARAT A _______");
		PreparatA a = new PreparatA("Paracet", 12.99, 3.5, 4);
		System.out.println(a);

		System.out.println("\n_____PREPARAT B _______");
		PreparatB b = new PreparatB("Paracet2", 4.99, 2.1, 7);
		System.out.println(b);

		System.out.println("\n_____PREPARAT C _______");
		PreparatC c = new PreparatC("Paracet3", 1.5, 4.2);
		System.out.println(c);
	}
}
