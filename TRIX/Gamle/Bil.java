public class Bil{
	private int regnummer;
	private int antPassasjerer;

	public Bil(int regnummer, int antPassasjerer){
		this.regnummer = regnummer;
		this.antPassasjerer = antPassasjerer;
	}

	public int getPassasjerer(){
		return antPassasjerer;
	}

	public int getRegnummer(){
		return regnummer;
	}
}