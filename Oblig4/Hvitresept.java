// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

// Abstrakt fordi det ikke skal opprettes noen instanser i denne klassen.
public abstract class Hvitresept extends Resept{
	
	// Klassens kontruktør. Tar inn parametere som settes inn i super-klassens konstruktør.
	public Hvitresept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit, int reseptId){
		super(legemiddel, utskrivendeLege, pasientId, reit, reseptId);
	}

	/* Initierer en tom metode som ble oppretter i abstract class Resept. 
	Gir ut hva slags farge det er på resepten. */
	@Override
	public String farge(){
		return "Hvit";
	}
}