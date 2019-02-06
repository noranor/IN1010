public class Bagasje{
	private Double vekt; 
	private Avgang avgang;

	// Trenger ikke henvisning til person. kun hvilken avgang bagasjen skal på.

	public Bagasje(Vouble vekt, Avgang avgang){
		this.vekt = vekt;
		this.avgang = avgang;

	}

	public Double hentVekt(){
		return vekt;

	}

	public Avgang hentAvgang(){
		return avgang;
	}
}