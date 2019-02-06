public abstract class Flybillett{
	// Abstract betyr at man ikke kan lage nye instanser av den. 
	// Vi kan ikke si "new Flybillett", fordi enten er den innenlands eller utenlands.
	// Kaller heller en new Innenlandsbillett eller new Utenlandsbillet
	
	private String sete;
	private Avgang avgang;

	public Flybillett(String sete, Avgang avgang){
		this.sete = sete;
		this.avgang = avgang;
	}

	public String hentSete(){
		return sete;
	}

	public Avgang hentAvgang(){
		return avgang;
	}

}