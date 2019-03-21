import java.util.ArrayList;

public abstract class Student extends Person{
	// Abstract - kan ikke lage noen instanser av den.
	protected ArrayList<Emne> emner = new ArrayList<Emne>();	

	public Student(String navn, int alder){
		super(navn, alder);

	}

	public abstract void regitrerer(Emne Emne);

	@Override
	public String toString(){
		return super.toString() + " tar" + emner;
	}
}