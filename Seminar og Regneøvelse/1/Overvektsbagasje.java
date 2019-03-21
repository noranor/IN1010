/* Subklasse av class Bagasje - Den har alle metoder bagasje har. Bygger på
og legger til ekstra funksjoner. Kommer helt an på om variabler er private,
protected eller public. */

public class Overvektsbagasje extends Bagasje{

	public Overvektsbagasje(Double vekt, Avgang avgang){
		super(vekt, avgang); //Kaller på konstruktøren i Bagasje - superkonstruktøren
		//Superkonstruktøren må kalles først
	}
	
}