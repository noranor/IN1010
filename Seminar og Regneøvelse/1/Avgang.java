/* Klassehierarki er ikke det samme som datastrukturtegning. Klassehieraki 
fremstiller klasser og deres subklasser */

public class Avgang{

	private String fra;
	private String til;
	private String tidspunkt; // Ikke int - forenklet.
	private String gate;

	public Avgang(String fra, String til, String tidspunkt, String gate){
		this.fra = fra;
		this.til = til;
		this.tidspunkt = tidspunkt;
		this.gate = gate;
	}

	public String hentAvgangssted(){
		return fra;
	}

	public String hentDestinasjon(){
		return til;

	}

	public String hentTidspunkt(){
		return tidspunkt;

	}

	public String hentGate(){
		return gate;
	}
}
