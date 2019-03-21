// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class Blaaresept extends Resept{
	// Egen statisk ID som blir økt i konstruktøren desto flere objekter av klassen som opprettes
	private static int id = 0;
	
	// Klassens kontruktør. Tar inn parametere som settes inn i super-klassens konstruktør.
	public Blaaresept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit){
		super(legemiddel, utskrivendeLege, pasientId, reit, id);
		// Øker ID nummer slik at alle instander har eget nummer.
		id ++;
	}

	/* Initierer en tom metode som ble oppretter i abstract class Resept. 
	Gir ut hva slags farge det er på resepten. */
	@Override 
	public String farge(){
		return "Blaa";
	}

	/* Initierer en tom metode som ble oppretter i abstract class Resept. 
	Alle blåe resepter gir 25% rabatt. Derfor ganges prisen med 0.25 */
	@Override
	public double prisAaBetale(){
		return legemiddel.hentPris() * 0.25;
	}

	// Overskriver toString() for mer lesbar output i terminal.
	@Override
	public String toString(){
		return "Legemiddel: " + legemiddel.hentNavn() + "\nPris å betale: " + prisAaBetale() + " kr" + "\nLege: " + utskrivendeLege.hentNavn();
	}
}