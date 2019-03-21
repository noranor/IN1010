// Obligatorisk innlevering 3, IN1010 V19, Nora Skjelstad
import java.util.Iterator;

public class Lenkeliste<T> implements Liste<T>{

	/* Setter start, slutt og størrelse. De er protected slik at kun subklasser
	av lenkeliste kan endre på variablene. */
	protected Node<T> start;
	protected Node<T> slutt;
	protected int stoerrelse = 0;

	// Oppretter en tom lenkeliste gjennom konstruktøren.
	public Lenkeliste(){
		start = null;
	}

	/**
	* Denne metoden skal fjerne og returnere elementets data på starten av listen.
	* @return dataen til første element i listen
	*/
	public T fjern(){
		/* Hvis starten er lik null (listene er tom), så er der ingenting å 
		fjerne og vi kaster en exception som sier at indeksen er ugyldig. */
		if(start == null){
			throw new UgyldigListeIndeks(0);

		/* Hvis start ikke er lik null: Henter først ut dataen til start.
		setter så start lik noden som kommer etter start og returnerer
		dataen vi hentet ut. */
		}else{
			T data = start.hentData();
			start = start.hentNeste();
			stoerrelse --;
			return data;
		}
	}

	/**
	* Denne metoden fjerner et element på en gitt posisjon
	* @param pos er posisjonen til elementet som fjernes.
	* @return elementet som fjernes.
	*/
	public T fjern(int pos){
		/* Sjekker først om posisjonen ikke er mindre enn 0 og ikke mer enn den faktiske størrelsen på listen gjennom metoden sjekkPos(). Kaster exception hvis den er det. */
		sjekkPos(pos);

		// Kaster exception hvis posisjonen er større enn maksimal mulig indeks.
		if(pos > stoerrelse - 1){
			throw new UgyldigListeIndeks(pos);
		}

		/* Hvis posisjon er den første noden, så hentes dataen først ut, deretter
		settes start lik noden som kommer etter starten. */
		if(pos == 0){
			T data = start.hentData();
			start = start.hentNeste();
			stoerrelse --;
			return data;
		}

		// Finner forskjellige noder som er relevant for videre tilfeller.
		Node<T> denne = norasIterator(pos);
		Node<T> forrige = norasIterator(pos - 1);
		Node<T> neste = denne.hentNeste();

		/* Hvis posisjonen tilsvarer det siste elementet, så hentes dataen først ut, 
		så kobler vi den forrige noden videre til "ingenting", deretter settes
		den forrige noden lik slutt. */
		if(pos == stoerrelse - 1){
			T data = denne.hentData();
			forrige.kobleVidere(null);
			slutt = forrige;
			stoerrelse --;
			return data;

		/* Hvis vi skal fjerne et element i midten av listen. Henter ut data og 
		kobler forrige videre til neste. Dette gjør at "denne" blir borte. */
		}else{
			T data = denne.hentData();
			forrige.kobleVidere(neste);
			stoerrelse --;
			return data;
		} 
	}

	/**
	* Denne metoden henter ut et element uten å fjerne det.
	* @param pos er posisjonen på elementet som skal hentes ut.
	* @return elementet.
	*/
	public T hent(int pos){
		sjekkPos(pos);

		Node<T> node = norasIterator(pos);
		if(node == null){
			throw new UgyldigListeIndeks(pos);
		}else{
			return node.hentData();
		}	
	}

	/**
	* Denne metoden setter inn et element på en gitt posisjon og overskrider
	* det som var der fra før av.
	* @param pos er posisjonen elementet skal settes inn på.
	* @param x er elementet som skal settes inn.
	*/
	public void sett(int pos, T x){
		/* Sjekker først om posisjonen ikke er mindre enn 0 og ikke mer enn den faktiske størrelsen på listen gjennom metoden sjekkPos(). Kaster exception hvis den er det. */
		sjekkPos(pos); 

		// Bruker iteratoren til å finne noden som er på posisjonen vi ønsker.
		Node<T> denne = norasIterator(pos);
		// Hvis den noden er null, så kastes en exception.
		if(denne == null){
			throw new UgyldigListeIndeks(pos);
		// Hvis ikke endrer vi dataen dens.
		}else{
			denne.endreData(x);
		}
	}

	/**
	* Denne metoden setter inn et element på slutten av listen.
	* @param T er elementet som skal settes inn.
	*/
	public void leggTil(T x){
		Node<T> nynode = new Node<T>(x);

		/* Hvis starten er lik null (tom liste) så settes starten og slutten lik
		nynode.  */
		if(start==null){
			start = nynode;
			slutt = nynode;
		}else{
			// Kobler nåværende slutt til ny node
			slutt.kobleVidere(nynode);
			// Gjør den nye noden om til slutten.
			slutt = nynode;

		}
		stoerrelse ++;
	}

	/**
	* Denne metoden legger til et nytt element i listen og skyver neste 
	* element ett hakk lenger bak.
	* @param pos er posisjonen elementet skal settes inn på.
	* @param x er elementet som skal settes inn.
	*/
	public void leggTil(int pos, T x){
		/* Sjekker først om posisjonen ikke er mindre enn 0 og ikke mer enn den faktiske størrelsen på listen gjennom metoden sjekkPos(). Kaster exception hvis den er det. */
		sjekkPos(pos);

		Node<T> nynode = new Node<T>(x);

		if(pos == 0){
			/* Hvis indeks er 0 og listen også er tom (start = null) så settes
			starten OG slutten lik den nye noden - for det er da bare ett element
			i listen */
			if(start == null){
				start = nynode;
				slutt = nynode;

			/* Hvis det er en node på starten, så kobles den nye noden videre til 
			start og setter den nye starten lik den nye noden. */
			}else{
				nynode.kobleVidere(start);
				start = nynode;
			}

		/* Hvis indeks ikke er 0, så skal vi prøve å få tak i noden som kommer
		før ønsket indeks gjennom pos-1. Vi finner ønsket indeks/node ved 
		denne.hentNeste(). Den nye noden kobles videre til neste og ønsket
		indeks/node kobles igjen til den nye noden.	*/
		}else{
			Node<T> denne = norasIterator(pos - 1);
			Node<T> neste = denne.hentNeste();
			nynode.kobleVidere(neste);
			denne.kobleVidere(nynode);
		}
		stoerrelse ++;
	}

	/**
	* Denne metoden angir størrelsen på listen gjennom en teller.
	* @return størrelsen.
	*/
	public int stoerrelse(){
		return stoerrelse;
	}

	/**
	* Denne metoden itererer igjennom alle nodene for å finne frem til en spesifikk
	* node på en spesifikk posisjon
	* @param onsketPosisjon er posisjonen til noden vi vil ha tak på.
	* @return noden vi ønsker.
	*/
	public Node<T> norasIterator(int onsketPosisjon){
		// setter først ønsket node lik starten, for et sted må man vel starte.
		Node<T> onsketNode = start;

		/* itererer så igjennom lista med ønsket posisjon og finner noden ves
		å bruke hentNeste()-metoden i class Node */
		for(int i = 0; i < onsketPosisjon; i++){
			onsketNode = onsketNode.hentNeste();
		}
		return onsketNode;
	}

	/**
	* Denne metoden sjekker om indekset vi vil ha tak på er innenfor "rammen"
	* av listen - altså ikke mindre enn 0 og ikke mer enn den faktiske
	* størrelsen på listen. Kaster en exception hvis den ikke er det.
	* @param pos er indekset som sjekkes
	* @throws UgyldigListeIndeks dersom indekset er utenfor listens rekkevidde.
	*/
	public void sjekkPos(int pos){
		if(pos > stoerrelse | pos < 0){
			throw new UgyldigListeIndeks(pos);
		}
	}
	@Override
	public Iterator<T> iterator(Node<T> node){
		return new LenkelisteIterator(node);
	}
}
