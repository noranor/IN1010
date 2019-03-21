public class Bil3{
	private String bilnummer;

	public void settNummer(String nummer){
		bilnummer = nummer;
	}

	public String hentNummer(){
		return bilnummer;
	}

	public void skrivUt(){
		System.out.println("Jeg er en Bil " + bilnummer);
	}

}
