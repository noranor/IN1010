// Obligatorisk innlevering 3, IN1010 V19, Nora Skjelstad
public class Node<T>{

	/* "data" er informasjonen som objektet vi skal sette inn inneholder, mens neste
	er noden som kommer etter denne noden. */
	public T data;
	public Node<T> neste;

	public Node(T x){
		this.data = x;
	}

	// Kobler noden videre til den neste noden. 
	public void kobleVidere(Node<T> n){
		neste = n;
	}

	// Henter ut informasjonen til noden.
	public T hentData(){
		return data;
	}

	// Endrer informasjonen til noden - viktig for sett()-metoden i lenkeliste.
	public void endreData(T x){
		data = x;
	}

	// Henter ut den neste noden.
	public Node<T> hentNeste(){
		return neste;
	}
}