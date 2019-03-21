public class Katt implements Comparable<Katt>{

	private String navn;
	private int alder;

	public Katt(String navn, int alder){
		this.navn = navn;
		this.alder = alder;
	}

	@Override
	public String toString(){
		return navn + " (" + alder + ")";
	}

	public int hentAlder(){
		return alder;
	}

	public String hentNavn(){
		return navn;
	}

	public int compareTo(Katt katt2){
		if(this.alder > katt2.alder){
			return 1;
		}

		else if(this.alder == katt2.alder){
			return 0;
		}

		else{
			return -1;
		}
	}
}