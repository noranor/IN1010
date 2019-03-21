// Obligatorisk innlevering 3, IN1010 V19, Nora Skjelstad

public abstract class SortertLenkeliste<T extends Comparable<T>> extends Lenkeliste<T>{

	// Kaller først på konstruktøren til Lenkeliste.
	public SortertLenkeliste(){
		super();
	}

	/**
	* Denne metoden skal sette inn elementer i sortert rekkefølge - fra minst til
	* størst.
	* @param x er data til noden som skal setten inn.
	*/
	@Override
	public void leggTil(T x){
		Node<T> node = new Node<T>(x);

		/* Sjekker først om lista er tom - altså at størrelsen er lik null. Kobler
		deretter noden videre til "ingenting", setter start OG slutt lik noden. */
		if(stoerrelse() == 0){
			node.kobleVidere(null);
			start = node;
			slutt = start;

		/* Sjekker så om noden vi vil sette inn er mindre eller lik starten.
		Kobler noden videre til den daværende starten og setter starten lik
		den nye noden. 

		compareTo:
		* Hvis x er mindre (<) (-1) eller lik (=) (0) start.hentData() */
		}else if(x.compareTo(start.hentData()) <= 0){
			node.kobleVidere(start);
			start = node;

		/* Sjekker deretter om noden vi skal sette inn er større eller lik enn
		den siste noden, altså at den skal kobles på slutten.
		
		compareTo:
		* Hvis x er større (>) (1) eller lik (=) (0) slutt.hentData() */	
		}else if(x.compareTo(slutt.hentData()) >= 0){
			slutt.kobleVidere(node);
			slutt = node;

		/* Hvis ikke lista er tom, noden ikke er mindre eller lik starten og noden 
		heller ikke er større enn slutten, så gjelder else. */
		}else{
			// Først går den igjennom listen og finner noder.
			for(int i = 0; i < stoerrelse(); i++){
				Node<T> naavaerende = norasIterator(i);

				/* Hvis den finner en node som er større eller lik neste naboen til noden vi vil 
				sette inn, så kobler vi noden vi vil sette inn etter den nåværende noden. 

				compareTo:
				* Hvis x er mindre (<) (-1) eller lik (=) (0) den neste til nåværende node. */
				if(x.compareTo(naavaerende.hentNeste().hentData()) <= 0){
					node.kobleVidere(naavaerende.hentNeste());
					naavaerende.kobleVidere(node);
					break;
				}
			}
		}
		stoerrelse ++;
	}

	/**
	* Denne metoden fjerner det største elementet fra den sorterte listen, 
	* altså det siste elementet i listen.
	* @return dataen til elementet som ble fjernet.
	* @throws UgyldigListeIndeks dersom listen er tom.
	*/
	@Override
	public T fjern(){
		// Sjekker først om listen er tom. Kaster exception hvis den er det.
		if(stoerrelse() == 0){
			throw new UgyldigListeIndeks(-1);
		}
		/* Hvis det kun er ett element i listen, så hentes dataen til elementet
		ut og start settes til null. */
		if(stoerrelse() == 1){
			T data = slutt.hentData();
			start = null;
			stoerrelse --;
			return data;

		/* Henter først ut dataen til siste element. Finner deretter noden som
		kommer før slutten (stoerrelse - 2) og setter noden før slutt lik slutt. */
		}else{
			T data = slutt.hentData();
			int i = stoerrelse() - 2;
			Node<T> forSlutt = norasIterator(i);
			slutt = forSlutt;
			stoerrelse --;
			return data;
		}
	}

	/**
	* Denne metoden overskriver sett-metoden i lenkeliste, slik at den ikke kan
	* bli brukt i SortertLenkeliste.
	* @throws UnsupportedOperationException dersom noen prøver å bruke metoden
	* på en sortert lenkeliste.
	*/
	@Override
	public void sett(int pos, T x){
		throw new UnsupportedOperationException();
	}

	/**
	* Denne metoden overskriver leggTil(pos)-metoden i lenkeliste, slik at den ikke kan
	* bli brukt i SortertLenkeliste.
	* @throws UnsupportedOperationException dersom noen prøver å bruke metoden
	* på en sortert lenkeliste.
	*/
	@Override
	public void leggTil(int pos, T x){
		throw new UnsupportedOperationException();
	}
}
