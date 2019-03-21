public class Motorsykkel{
	private int regnummer;
	private int motorstr;

	public Motorsykkel(int regnummer, int motorstr){
		this.regnummer = regnummer;
		this.motorstr = motorstr;
	}

	public int getMotorsoerrelse(){
		return motorstr;
	}

	public int getRegnummer(){
		return regnummer;
	}
}
