import java.util.ArrayList; // Til å opprette lister
import java.util.Iterator; // Til For-løkker

public class Rack extends Node {
	private int maxNoder;
	private ArrayList<Node> rackListe = new ArrayList<Node>(0);

	public boolean ledigPlass() {
		private int plass = maxNoder - rackListe.size();
		/* "plass" forteller oss om man kan legge node inn 
		i racket eller ikke. Returnerer en bolsk verdi*/
		if(!plass) {
			return true;
		}
		/* Så lenge variabelen "plass" ikke er 0, så vil 
		den returnere "True" som en indikasjon på at det er plass.*/
		else {
			return false; // return null;
		}
	}

	public List SettInnNode1(int minne, int prosessor) { // Denne er feil
		Node nyNode = new Node();
		nyNode.settMinne(minne);
		nyNode.antallProsessorer(prosessor);

		rackListe.add(nyNode);

		return rackListe;
	/* NB! Forskjell på SettInnNode1() som finnes i class
	 Rack 
	og SettInnNode2() som finnes i class Regneklynge.*/
	}

	public int prosessorerPrRack(){
		int prosPrRack; // Oppretter tom variabel
		for(object Node : rackListe){ // rackListe.forEach(prosPrRack = ++ Object Node.antallProsessorer(int prosessorer))
			int prosPrPack = prosPrRack + ; // IKKE FERDIG

		return prosPrPrack;
		}
	}
}