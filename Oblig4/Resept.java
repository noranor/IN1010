// OBLIGATORISK INNLEVERING 2, IN1010 V19, Nora Skjelstad

// Abstrakt fordi det ikke skal opprettes noen instanser i denne klassen.
public abstract class Resept{
	// Oppretter variabler for klassen
	protected Legemiddel legemiddel;
	protected Lege utskrivendeLege;
	protected int reit;
	private Pasient pasientId;
	private int reseptId;
	
	// Klassens konstruktør - initierer variablene
	public Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasientId, int reit, int reseptId){
		this.legemiddel = legemiddel;
		this.utskrivendeLege = utskrivendeLege;
		this.pasientId = pasientId;
		this.reit = reit;
		this.reseptId = reseptId;
	}

// Generelle get-metoder nedenfor
	public int hentId(){
		return reseptId;
	}

	public Legemiddel hentLegemiddel(){
		return legemiddel;
	}

	public Lege hentLege(){
		return utskrivendeLege;
	}

	public Pasient hentPasientId(){
		return pasientId;
	}

	public int hentReit(){
		return reit;
	}

	/* Reit er antall ganger resepten kan brukes inntill den er ugyldig.
	Dersom reit er 0 (altså brukt opp) vil metoden returnere false og trekke fra
	reit.*/
	public boolean bruk(){
		if(reit == 0){
			return false;
		}else{
			reit --;
			return true;
		}
	}

	// Oppretter tomme abstrakte metoder som skal "fylles inn" og initieres i subklasser.
	abstract public String farge(); 
	abstract public double prisAaBetale();
}