import java.util.Iterator;

public class LenkelisteIterator<T> implements Iterator<T>{

	private Node<T> naavaerende;


	public LenkelisteIterator(Node<T> denne){
		this.naavaerende = denne;
	}

	/**
	* Returnerer en boolean som sjekker om noden har en neste.
	* @return true hvis den har en neste. False hvis ikke.
	*/
	@Override 
	public boolean hasNext(){
		if(naavaerende.hentNeste() != null){
			return true;
		}else{
			return false;
		}
	}

	/**
	* Henter ut det neste elementet.
	* @return det neste elementet.
	*/
	@Override
	public T next(){
		return naavaerende.hentNeste().hentData();
	}
	
}