// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class TestResepter{
	public static void main(String[] args) {

		// Oppretter navn og variabler til å legge inn i preparater.
		String navnA = "Paracet";
		double prisA = 109.0;
		double prisB = 105.0;
		double virkestoff = 4.3;
		int styrke = 4;

		// Oppretter preparater. Èn er billigere for å teste rabattfunksjoner.
		PreparatA prepA = new PreparatA(navnA, prisA, virkestoff, styrke);
		PreparatA prepbillig = new PreparatA(navnA, prisB, virkestoff, styrke);

		// Oppretter lege
		Lege roger = new Lege("Roger");

// ------- Tester militærresept-klassen -----

		int pasientId = 456;
		int reit = 5;

		MillResept millR = new MillResept(prepA, roger, pasientId, reit);
		MillResept millR2 = new MillResept(prepA, roger, pasientId, reit);

		assert(millR.farge() == "Hvit");
		assert(millR.prisAaBetale() == 0);

		// Første MillResept-objekt, og derfor skal ID'en være lik 0
		assert(millR.hentId()==0);
		// Andre MillResept-objekt, og derfor skal ID'en være lik 1
		assert(millR2.hentId()==1);

		assert(millR.hentLegemiddel()==prepA);
		assert(millR.hentLege()==roger);
		assert(millR.hentPasientId()==pasientId);
		assert(millR.hentReit()==reit);

		for(int i = 0; i <= reit; i ++){
			assert(millR.bruk()==true);
		}
		// Ved det sjette forsøket på bruk, skal false returneres. Reit er brukt opp.
		assert(millR.bruk()==false);

// ------ Tester P-resept-klassen -------

		int pasientId2 = 433;

		Presept pres = new Presept(prepA, roger, pasientId2);

		assert(pres.farge() == "Hvit");
		// Skal alltid gi en rabatt på 108 kr
		assert(pres.prisAaBetale()==(prisA-108.0));

		// Første P-resept-objekt, og derfor skal ID'en være lik 0.
		assert(pres.hentId()==0);

		assert(pres.hentLegemiddel()==prepA);
		assert(pres.hentLege()==roger);
		assert(pres.hentPasientId()==pasientId2);

		// reit er alltid lik 3 på P-resepter.
		assert(pres.hentReit()==3);
		for(int i = 0; i <= 3; i ++){
			assert(pres.bruk()==true);
		}
		// Ved det fjerde forsøket på bruk skal false returneres. Reit er brukt opp.
		assert(pres.bruk()==false);

		// Tester om prisen endres til 0 hvis prisen er mindre enn 108kr
		Presept billig = new Presept(prepbillig, roger, pasientId2);
		assert(billig.prisAaBetale()==0);


// ------ Tester blåresept-klassen ------

		int pasientId3 = 551;
		int reit3 = 7;

		Blaaresept blaa = new Blaaresept(prepA, roger, pasientId3, reit3);

		assert(blaa.farge() == "Blaa");
		// Skal alltid gi 25% rabatt
		assert(blaa.prisAaBetale() == (prisA*0.25));

		// Første blaaresept-objekt, og derfor skal ID'en være lik 0
		assert(blaa.hentId()==0);
		assert(blaa.hentLegemiddel()==prepA);
		assert(blaa.hentLege()==roger);
		assert(blaa.hentPasientId()==pasientId3);
		assert(blaa.hentReit()==reit3);

		for(int i = 0; i <= reit3; i ++){
			assert(blaa.bruk()==true);
		}
		// Ved det åttende forsøket på bruk skal false returneres. Reit er brukt opp.
		assert(blaa.bruk()==false);

	}
}

