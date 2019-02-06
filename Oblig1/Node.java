/* Oblig 1, IN1010 v-19, Nora Skjelstad */

class Node{
	// Initierer variabler
	private int prosessor;
	private int minne;

	/* Klassens konstruktør. Setter variablene ovenfor til 
	variablene konstruktøren mottar. */
	public Node(int minnet, int prosessoren){
		minne = minnet;
		prosessor = prosessoren;
	}

	// Returnerer antall prosessorer per node.
	public int antallProsessorer(){
		return prosessor;
	}

	/* Returnerer true dersom minnet oppfyller minstekravet 
	for påkrevd mine. False hvis ikke. */
	public boolean nokMinne(int paakrevdMinne){
		return(minne >= paakrevdMinne);
	}

}