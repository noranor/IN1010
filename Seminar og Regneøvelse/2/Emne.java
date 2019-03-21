public class Emne{

	private String kode;
	private String navn;
	private boolean master;

	public Emne(Striing kode, String navn, boolean master){
		this.kode = kode;
		this.navn = navn;
		this.master = master;
	}

	public boolean erMaster(){
		return master;
	}

	@Override
	public String toString(){
		return kode + ": " + navn;
	}
}