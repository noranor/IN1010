public class Pasient{

	private String navn;
	private String fodselsnummer;
	private Stabel<Resept> reseptliste;
	private static int id;

	public Pasient(String navn, String fodselsnummer){
		this.navn = navn;
		this.fodselsnummer = fodselsnummer;
		id ++;
	}
	/**
	* Legger til nytt resept i listen.
	* @param resept er resepten som skal legges til.
	*/
	public void leggTilResept(Resept resept){
		reseptliste.leggPaa(resept);
	}

	/**
	* Henter ut listen med resepter.
	* @return listen av type Stabel.
	*/
	public Stabel<Resept> hentListe(){
		return null;
	}

}