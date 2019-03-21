// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class Presept extends Hvitresept{
	/* 	VARIABLER FOR P-RESEPT:
	- P-resept har 108 kr i rabatt.
	- Statisk ID som blir økt desto flere objekter av klassen
	som blir opprettet
	- Reit (brukslengde) er alltid 3 for P-resepter */

	public static double rabatt = -108.0;
	private static int id = 0;
	final static int reit = 3;

	// Klassens kontruktør. Tar inn parametere som settes inn i super-klassens konstruktør.
	public Presept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId){
		super(legemiddel, utskrivendeLege, pasientId, reit, id);
	}

	// Overskriver toString() for mer lesbar output i terminal.
	@Override
	public String toString(){
		return "Legemiddel: " + legemiddel.hentNavn() + "\nPris å betale: " + prisAaBetale() + " kr" + "\nLege: " + utskrivendeLege.hentNavn();
	}

	/* Initierer en tom metode som ble oppretter i abstract class Resept. 
	Alle P-resepter gir 108 kr i rabatt. Dersom dette gjør at prisen blir negativ, 
	settes prisen heller til 0. */
	@Override
	public double prisAaBetale(){
		if(legemiddel.hentPris() + rabatt <= 0){
			return 0.0;
		}else{
			return legemiddel.hentPris() + rabatt;
		}
	}
}