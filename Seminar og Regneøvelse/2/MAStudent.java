public class MAStudent extends Student{
	private Person veileder;

	public MAStudent(String navn, int alder){
		super(navn, alder);

	}
	public MAStudent(String navn, int alder, Person veileder){
		super(navn, alder);
		this.veileder = veileder;
	}

	@Override
	public void registrer(Emne emne){
		emner.add(emne);
	}

	@Override
	public String toString(){
		return super.toString() + "\n  - Veileder: " + veileder;
	}
}