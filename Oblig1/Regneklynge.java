import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

class Regneklynge{
	private int noderPerRack;
	public ArrayList<Rack> regneklynge;
	// private File fil;

	public Regneklynge(int nPerRack){
		ArrayList<Rack> regneklynge = new ArrayList<Rack>();
		noderPerRack = nPerRack;
		// Velger ArrayList ettersom det ikke er fastsatt begrensning på hvor lang arrayen regneklynge skal være. 
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

	public Rack finnLedigRack(){
		// Skal finne ett ledig rack.
		for(Rack rack : regneklynge){
			if(rack.ledigPlass()){
				return rack;
				// Returnerer et rack dersom det er ledig
			}
		}return null;
		// Returnerer null dersom metoden ikke finner noen ledige racks.
	}
*/
	public void settInnNode2(Node node){
		for(Rack rack : regneklynge){
			if(rack.ledigPlass()){
				rack.settInnNode1(node);
			}else{ // Exception e{...}
				Rack rack2 = new Rack(noderPerRack);
				rack2.settInnNode1(node);
			}
		}
	}

		
	public int antProsessorer(){
		int pros = 0;
		for(Rack rack : regneklynge){
			pros = pros + rack.prosessorerPerRack();
		}
		return pros;
	}

	public int noderMedNokMinne(int paakrevdMinne){
		int nokMinne = 0;
		for(Rack rack : regneklynge){
			nokMinne = nokMinne + rack.noderMedNokMinne(paakrevdMinne);
		}
		return nokMinne;
	}

	public int antRacks(){
		Rack alleRacks = regneklynge.get(0);
		return alleRacks.hentAlleRacks();
		// Ettersom .hentAlleRacks()-metoden i Rack.java returnerer en static variabel, har det ikke noe å si hvilket rack man ta utgangspunkt i. Henviser derfor for enkelthetens skyld til det første racket i regneklyngen.
	}
}
