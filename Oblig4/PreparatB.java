// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class PreparatB extends Legemiddel{
	private int styrke;
	// Egen statisk ID som blir økt i konstruktøren desto flere objekter av klassen som opprettes
	private static int id = 0;

	public PreparatB(String navn, double pris, double virkestoff, int styrke){
		super(navn, pris, virkestoff, id);

		this.navn = navn;
		this.pris = pris;
		this.virkestoff = virkestoff;
		this.styrke = styrke;
		// Øker ID nummer slik at alle instander har eget nummer.
		id ++;     
	}

	public int hentVaneStyrke(){
		return styrke;
	}

	// Overskriver toString() for mer lesbar output i terminal.
	@Override
	public String toString(){
		return "ID: " + hentId() + "\n" + "Pris: " + hentPris() + " kr" + "\n" + "Virkestoff: " + hentVirkestoff() + " mg" + "\n" + "Vanedannede styrke: " + hentVaneStyrke() + "\n";
	}
}
