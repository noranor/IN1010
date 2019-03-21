import java.util.HashMap;

public class Fag{
	
	private String navn;
	private HashMap<String, Student> studenterIfaget = new HashMap<String, Student>();

	public Fag(String navn){
		this.navn = navn;
	}

	@Override
	public String toString(){
		retturn navn;
	}

	public void leggTilStudent(Student student){
		if(finnesStudent(student)){
			System.out.println(student.toString() + " tar allerede " + navn);
		}else{
			studenterIfaget.put(student.toString(), student);
		}
	}

	public boolean finnesStudent(Student student){
		if(studenterIfaget.containsValue(student)){
			return true;
		}
		return false;
	}
}
