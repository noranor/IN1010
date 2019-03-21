// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

public class Lege implements Comparable<Lege>{
	// Oppretter variabel for klassen
	private String navn;
	private Lenkeliste<Resept> utskrevendeResepter;

	// Klassen konstruktør. Tar inn to parametere som initierer klassens variabel.
	public Lege(String navn){
		this.navn = navn;
	}

	// Overskriver toString() for mer lesbar output i terminal.
	@Override 
	public String toString(){
		return "Navn på lege: " + hentNavn(); 
	}

	public String hentNavn(){
		return navn;
	}

	public Lenkeliste<Resept> hentUtskrevendeResepter(){
		return utskrevendeResepter;
	}

	/* Metode for å skrive ut en resept. Har Exception hvis Lege skal skrive ut resept av 
	typen PreparatA */
	public Resept skrivResept(Legemiddel legemiddel, Pasient pasientId, int reit) throws UlovligUtskrift{

		// Oppretter en resept med parametere + legemiddelet
		MillResept millR = new MillResept(legemiddel, this, pasientId, reit);

		/* Dette er klassen til en vanlig lege og hvis en vanlig lege prøver å skrive ut en resept 
		av PreparatA - som er narkorisk - vil denne metoden utføre en exception */
		if(legemiddel instanceof PreparatA == false){
			return millR;
		}else{
			throw new UlovligUtskrift(this, legemiddel);
		}
	}

	public Resept skrivBlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit) throws UlovligUtskrift{
		Blaaresept blaa = new Blaaresept(legemiddel, utskrivendeLege, pasientId, reit);
		if(legemiddel instanceof PreparatA == false){
			return blaa;
		}else{
			throw new UlovligUtskrift(this, legemiddel);
		}
	}

	public Resept skrivMillResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit) throws UlovligUtskrift{
		Hvitresept mill = new MillResept(legemiddel, utskrivendeLege, pasientId, reit);
		if(legemiddel instanceof PreparatA == false){
			return mill;
		}else{
			throw new UlovligUtskrift(this, legemiddel);
		}
	}

	public Resept skrivPResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId) throws UlovligUtskrift{
		Hvitresept pres = new Presept(legemiddel, utskrivendeLege, pasientId);
		if(legemiddel instanceof PreparatA == false){
			return pres;
		}else{
			throw new UlovligUtskrift(this, legemiddel);
		}
	}


	/**
	* Denne metoden sjekker om legen sitt navn kommer før i alfabetet enn
	* legen vi sammenlikner med.
	* @param lege2 er legen vi sammenlikner med.
	* @return 0 hvis legen har akkurat samme navn som lege2.
	* @return 1 hvis legen kommer før lege2 i afabetet.
	* @return -1 hvis legen kommer etter lege2 i alfabetet.
	*/
	@Override
	public int compareTo(Lege lege2){
		return navn.compareTo(lege2.hentNavn());
	}
}