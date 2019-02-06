/* Oblig 1, IN1010 v-19, Nora Skjelstad */

import java.util.ArrayList;

class Rack{
	/* Initierer variabler. Velger ArrayList fordi det gjør
	programmet mer fleksibelt enn å bruke Array Node[] */
	private int antallRacks;
	private int noderPerRack;
	private ArrayList<Node> rackListe = new ArrayList<Node>();

	/* Klassens konstruktør. Setter variablene ovenfor til variablene 
	konstruktøren mottar. Øker antallet produserte racks med static variabel. */
	public Rack(int nPerRack){
		noderPerRack = nPerRack;
		antallRacks ++;
	}

	/* Sjekker om rackets størrelse er mindre en noderPerRack. Returnerer true 
	hvis det er det, false hvis det ikke er det. */
	public boolean ledigPlass(){
		if(rackListe.size() < noderPerRack){
			return true;
		}else{
			return false;
		}
	}

	// Setter inn node i racket. OBS! Skill mellom denne og settInnNode2() i regneklynge.
	public void settInnNode1(Node node){
		rackListe.add(node);
	}

	/* Teller antall prosessorer som finnes i alle nodene som befinner seg i racket.
	antallProsessorer() er fra class Node. Returnerer antallet prosessorer i Racket */
	public int prosessorerPerRack(){  
		int pros = 0;
				for(Node node : rackListe){
					pros = pros + node.antallProsessorer();
		}
		return pros;
	}

	/* Teller antall noder so, oppfyller kriteriene for påkrevd minne. nokMinne() er 
	fra class Node. Returnerer antallet noder som har oppfylt kravet. */
	public int noderMedNokMinne1(int paakrevdMinne){
		int memory = 0;
		for(Node node : rackListe){
			if(node.nokMinne(paakrevdMinne) == true){
				memory ++;
			}
		}
		return memory;
	}

	// Returner variabelen som har oversikt over antall racks som er laget.
	public int hentAlleRacks(){
		return antallRacks;
	}
}