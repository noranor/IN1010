import java.util.HashMap;

public class Student{
	
	private String navn;
	private HashMap<String, Fag> minefag = new HashMap<String, Fag>();

	public Student(String navn){
		this.navn = navn;
	}

	@Override
	public String toStrinf(){
		return navn;
	}

	public void leggTilFag(Fag fag){
		if(tarFag(fag)){
			System.out.println(navn + " tar allerede " + fag.toString());
		}
	}

	public boolean tarFag(Fag fag){
		if(minefag.containsValue(fag)){
			return true;
		}
		return false;
	}
}