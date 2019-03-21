// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class Legemiddel{
	// Oppretter variabler for klassen
	protected String navn;
	public double pris;
	public double virkestoff;
	protected int id;

	// Klassens konstrukt - initierer variablene.
	public Legemiddel(String navn, double pris, double virkestoff, int id){
		this.navn = navn;
		this.pris = pris;
		this.virkestoff = virkestoff;
		this.id = id;
	} 
// Nedenfor er det allminnelige get-metoder.

	public String hentNavn(){
		return navn;
	}

	public int hentId(){
		return id;
	}

	public double hentPris(){
		return pris;
	}

	public double hentVirkestoff(){
		return virkestoff;
	}

	// Metode for å endre pris
	public void settNyPris(double nyPris){
		pris = nyPris;
	}

}