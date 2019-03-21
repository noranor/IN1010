// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class PreparatC extends Legemiddel{
	// Egen statisk ID som blir økt i konstruktøren desto flere objekter av klassen som opprettes
	private static int id = 0;

	public PreparatC(String navn, double pris, double virkestoff){
		super(navn, pris, virkestoff, id);

		this.navn = navn;
		this.pris = pris;
		this.virkestoff = virkestoff;
		// Øker ID nummer slik at alle instander har eget nummer.
		id ++;
       
	}

	// Overskriver toString() for mer lesbar output i terminal.
	@Override
	public String toString(){
		return "ID: " + hentId() + "\n" + "Pris: " + hentPris() + " kr" + "\n" + "Virkestoff: " + hentVirkestoff() + " mg" + "\n";
	}
}