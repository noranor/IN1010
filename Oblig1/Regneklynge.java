import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

class Regneklynge{
	private int noderPerRack;
	public ArrayList<Rack> regneklynge = new ArrayList<Rack>();


	public Regneklynge(int nPerRack){
		noderPerRack = nPerRack;
		// Velger ArrayList ettersom det ikke er fastsatt begrensning på hvor lang arrayen regneklynge skal være. 
	}
	public void addRack(int noderPerRack){
		Rack rack = new Rack(noderPerRack);
		regneklynge.add(rack);
	}

/*
	public Regneklynge(Scanner filnavn){ 
		Scanner fil = null;
		try{
			fil = new Scanner(new File(filnavn));
		} catch (Exception e){
			System.out.println("Finner ikke " + filnavn + "!");
			System.exit(1);
		}
	}

*/
	public void settInnNode2(Node node){
		// Hvis racket i regneklyngen er ledig, setter noden inn.
		for(Rack rack : regneklynge){
			if(rack.ledigPlass()){
				rack.settInnNode1(node);
				return; 
				// Fikk adda node. program slutter.
			}
		}
		addRack(noderPerRack);
		regneklynge.get(regneklynge.size() - 1).settInnNode1(node);
		// TODO: Få tak i siste element og legg til der.
	}

		
	public int antProsessorer(){
		int pros = 0;
		for(Rack rack : regneklynge){
			pros = pros + rack.prosessorerPerRack();
		}
		return pros;
	}

	public int noderMedNokMinne2(int paakrevdMinne){
		int nokMinne = 0;
		for(Rack rack : regneklynge){
			nokMinne = nokMinne + rack.noderMedNokMinne1(paakrevdMinne);
		}
		return nokMinne;
	}

	public int antRacks(){
		Rack alleRacks = regneklynge.get(0);
		return alleRacks.hentAlleRacks();
		// Ettersom .hentAlleRacks()-metoden i Rack.java returnerer en static variabel, har det ikke noe å si hvilket rack man ta utgangspunkt i. Henviser derfor for enkelthetens skyld til det første racket i regneklyngen.
	}
}
