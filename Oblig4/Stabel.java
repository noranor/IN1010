// Obligatorisk innlevering 3, IN1010 V19, Nora Skjelstad

public abstract class Stabel<T> extends Lenkeliste<T>{

	/**
	* Denne metoden legger på elementer i slutten av listen.
	* @param x er elemetet som legges til.
	*/
	public void leggPaa(T x){
		leggTil(x);
	}

	/**
	* Denne metoden tar av elementer i slutten av listen.
	* @return elementet som ble tatt av.
	*/
	public T taAv(){
		// Siste element vil alltid ha indeks stoerelse()-1.
		int pos = stoerrelse() - 1;
		T data = fjern(pos);
		return data;
	}
}