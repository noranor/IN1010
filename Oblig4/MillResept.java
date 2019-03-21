// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class MillResept extends Hvitresept{
	// Egen statisk ID som blir økt i konstruktøren desto flere objekter av klassen som opprettes
	private static int id = 0;

	public MillResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit){
		// Kaller på konstruktøren i super-klassen med parametere fra egen kontruktør.
		super(legemiddel, utskrivendeLege, pasientId, reit, id);
		// Øker ID nummer slik at alle instander har eget nummer.
		id ++;
	}

	// Overskriver toString() for mer lesbar output i terminal.
	@Override
	public String toString(){
		return "Legemiddel: " + legemiddel.hentNavn() + "\nPris å betale: " + prisAaBetale() + " kr" + "\nLege: " + utskrivendeLege.hentNavn();
	}

	/* Initierer en tom metode som ble oppretter i abstract class Resept. 
	Alle millitærresepter gir 100% rabatt. Derfor settes prisen til 0. */
	@Override
	public double prisAaBetale(){
		return 0.0;
	}
}