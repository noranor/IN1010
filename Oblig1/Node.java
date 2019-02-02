class Node{
	private int prosessor;
	private int minne;
	private static int alleNoder;
	// Velger en static variabel for at den skal kunne telle absolutt alle noder - uavhengig av hvor mange racks som opprettes.

	// private static int alleProsessorer;

	public Node(int minnet, int prosessoren){
		minne = minnet;
		prosessor = prosessoren;
		alleNoder ++;
		/* Klassens konstruktør

			Initierer minnet og antall prosessorer Noden skal ha, samt øker det totale antallet noder som har blitt produsert med static variabelen alleNoder.
		*/

		//alleProsessorer = alleProsessorer + prosessoren;
	}

	public int antallProsessorer(){
		return prosessor;
		// Returnerer antall prosessorer per Node.
	}

	public int hentAlleNoder(){
		return alleNoder;
		// Returnerer en static variabel i class Node. Se kommentaren øverst.
	}

	public boolean nokMinne(int paakrevdMinne){
		return(minne >= paakrevdMinne);
		// Returnerer true dersom minnet oppfyller minstekravet for påkrevd mine. False hvis ikke.
	}

}

