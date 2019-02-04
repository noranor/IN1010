import java.util.ArrayList;

class Rack{
	private static int antallRacks;
	// Velger en static variabel for at den skal kunne telle absolutt alle racks - uavhengig av hvor mange regneklynger som opprettes.
	private int noderPerRack;
	private ArrayList<Node> rackListe = new ArrayList<Node>();
	// Velger ArrayList fordi Node[] gjorde prorammet noe mer komplisert.

	public Rack(int nPerRack){
		noderPerRack = nPerRack;
		antallRacks ++;
		/* Klassens konstruktør. 

			Initierer noderPerRack og øker totale antallet produserte racks.

			noderPerRack/nPerRack setter begrensning på hvor langt ArrayList kan være.
		*/

	}

	public boolean ledigPlass(){
		if(rackListe.size() < noderPerRack){
			return true;
		}else{
			return false;
		}
		// Sjekker om rackets størrelse er mindre en noderPerRack. Returnerer true hvis det er det, false hvis det ikke er det.
	}

	public void settInnNode1(Node node){
		// OBS! Viktig å skille mellom settInnNode1() i class Rack og settInnNode2() i class Regneklynge.
		rackListe.add(node);
		// Legger til node i racket.
	}

	public int getAntNoder(){
		Node noder = rackListe.get(0);
		return(noder.hentAlleNoder());
		// Returnerer alle noder som finnes. Ettersom returverdien kommer fra en static variabel i class Node  har det ingenting å si hvilket element i ArrayList man tar utgangpunkt i. Velger derfor for enkelthetens skyld første [0] element.
		}


	public int prosessorerPerRack(){
		int pros = 0;
				for(Node node : rackListe){
			pros = pros + node.antallProsessorer();
							//.antallProsessorer() er fra class Node.
		}
		return pros;
		// Teller antall prosessorer som finnes i alle nodene som befinner seg i racket.
	}

	public int noderMedNokMinne1(int paakrevdMinne){
		int memory = 0;
		for(Node node : rackListe){
			if(node.nokMinne(paakrevdMinne) == true){
					// .nokMinne() er fra class Node.
				memory ++;
			}
		}
		return memory;
		// Teller antall noder som oppfyller kriteriene for påkrevd minne.
	}

	public int hentAlleRacks(){
		return antallRacks;
		// Returnerer en static variabel i class Rack. Se kommentaren øverst.
	}
}
