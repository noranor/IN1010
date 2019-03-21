// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class Spesialist extends Lege implements Godkjenningsfritak{
	// Oppretter variabel for klassen
	public int kontrollID;
	
	/* Klassens kontruktør. Tar inn parametere som settes inn i super-klassens konstruktør.
	og som initieres med variabelen ovenfor */
	public Spesialist(String navn, int kontrollID){
		super(navn);
		this.kontrollID = kontrollID;
	}
	public int hentKontrollID(){
		return kontrollID;
	}

	/* Overskriver skrivResept()-metoden i Lege slik at instanser av typen Spesialist
	har mulighet til å skrive ut resepter av typen PreparatA */
	@Override
	public Resept skrivResept(Legemiddel legemiddel, Pasient pasientId, int reit){

		/* Oppretter en resept med parametere + legemiddelet. "this" er en referanse
		til denne klassen */
		MillResept millR = new MillResept(legemiddel, this, pasientId, reit);
		return millR;
	}

	// Overskriver toString() for mer lesbar output i terminal.
	@Override 
	public String toString(){
		return "Navn på lege: " + hentNavn() + "\nKontroll-ID: " + hentKontrollID();
	}
	 //---------------------------


	@Override
	public Resept skrivBlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit){
		Blaaresept blaa = new Blaaresept(legemiddel, utskrivendeLege, pasientId, reit);
		return blaa;
	}

	@Override
	public Resept skrivMillResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit){
		Hvitresept mill = new MillResept(legemiddel, utskrivendeLege, pasientId, reit);
		return mill;
	}

	@Override
	public Resept skrivPResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId){
		Hvitresept pres = new Presept(legemiddel, utskrivendeLege, pasientId);
		return pres;
	}

}