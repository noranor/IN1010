class nicholas{

	public static void main (String[] args) {
		
		Node myNode = new Node(1024, 2);

		// Forventer 2
		System.out.println(myNode.antallProsessorer());

		// Fonrventer 1
		System.out.println(myNode.hentAlleNoder());

		// nok forventer false
		System.out.println(myNode.nokMinne(10123));

		// forventer true
		System.out.println(myNode.nokMinne(1024));

		// forventer true
		System.out.println(myNode.nokMinne(1));



		Rack nyRack = new Rack(3); 


		nyRack.settInnNode1(myNode);

		// Forventer true
		System.out.println(nyRack.ledigPlass());

		// Forventer 1
		System.out.println(nyRack.getAntNoder());

		// Forventer 2
		System.out.println(nyRack.prosessorerPerRack());

		// Forventer 1
		System.out.println(nyRack.noderMedNokMinne(1024));

		// Forventer 1
		System.out.println(nyRack.hentAlleRacks()); 

		Regneklynge abel = new Regneklynge(12);
		abel.settInnNode2(myNode);

		// Forventer objektadresse
		//System.out.println(abel.finnLedigRack());

	}
}

/* OUTPUT:
2
1
false
true
true
true
1
2
1
1
*/



