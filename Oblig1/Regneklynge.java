/* Oblig 1, IN1010 v-19, Nora Skjelstad */

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

class Regneklynge{
	/* Initierer variabler. Velger ArrayList fordi det gjør
	programmet mer fleksibelt enn å bruke Array Rack[] samt at 
	Regneklynge har et ubegrenset antall racks */
	private int noderPerRack;
	public ArrayList<Rack> regneklynge = new ArrayList<Rack>();

	/* Klassens konstruktør nr. 1. Setter variablene ovenfor til variablene 
	konstruktøren mottar.*/
	public Regneklynge(int nPerRack){
		noderPerRack = nPerRack;
	}

	/* Klassens konstruktør nr. 2. Setter variablene ovenfor til variablene 
	konstruktøren mottar fra en tekstfil. Konstruktøren leser tekstfilen,
	deler tekstfilen opp og tildeler deler av tekstfilen til gitte
	variabler. Disse variablene bruke så til å genere noder ut fra
	det tekstfilen spesifiserer*/
	public Regneklynge(String filnavn){ 
		Scanner fil = null;

		// Try og catch i tilfelle konstruktøren ikke kan finne noen fil.
		try{
			fil = new Scanner(new File(filnavn));
		} catch (FileNotFoundException e){
			System.out.println("Finner ikke " + filnavn + "!");
			System.exit(1);
		}

		// Første linjen (fil.nextline()) i tekstdokumentet er noderPerRack.
		noderPerRack = Integer.parseInt(fil.nextLine());

		while(fil.hasNextLine()){
			String linje = fil.nextLine();
			// linje = horisontal linje i .txt-dokumentet
			String[] ord = linje.split(" ");
			int antall = Integer.parseInt(ord[0]);
			int minne = Integer.parseInt(ord[1]);
			int prosessor = Integer.parseInt(ord[2]);

			// Genererer noder og setter de inn i Regneklynge.
			for(int i = 0; i < antall; i++){
				Node node = new Node(minne, prosessor);
				settInnNode2(node);
			}
		}
	}

	// Oppretter et nytt rack og legger det til regneklynge.
	public void addRack(int noderPerRack){
		Rack rack = new Rack(noderPerRack);
		regneklynge.add(rack);
	}

	/* Setter inn node i et ledig rack. Hvis det ikke er noen
	ledige racks, vil metoden addRack() bli kalt og noden 
	settes inn i dette istedet */
	public void settInnNode2(Node node){
		for(Rack rack : regneklynge){
			if(rack.ledigPlass()){
				rack.settInnNode1(node);
				// Når noden er addet -> return; for å avslutte loopen
				return; 
			}
		}
		addRack(noderPerRack);

		/* Får tak i siste element i regneklyngen, hvilket er det
		racket vi nettopp opprettet. Setter så inn noden */
		regneklynge.get(regneklynge.size() - 1).settInnNode1(node);
	}

	// Teller hvor mange prosessorer det er i regneklynge. Returnerer antallet.
	public int antProsessorer(){
		int pros = 0;
		for(Rack rack : regneklynge){
			pros = pros + rack.prosessorerPerRack();
		}
		return pros;
	}

	// Teller hvor mange noder som oppfyller kravet for nok minne og returnerer antallet.
	public int noderMedNokMinne2(int paakrevdMinne){
		int nokMinne = 0;
		for(Rack rack : regneklynge){
			nokMinne = nokMinne + rack.noderMedNokMinne1(paakrevdMinne);
		}
		return nokMinne;
	}

	// Teller hvor mange racks det er i regneklynge. Returnerer antallet. 
	public int antRacks(){
		int antRacks = 0;
		for(Rack rack : regneklynge){
			antRacks = antRacks + rack.hentAlleRacks();

		}
		return antRacks;
	}
}