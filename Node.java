public class Node {
	private int minne;
	private int prosessor;
	// Oppretter konstruktør og definerer minne og prosesor per Node.

	public void antallProsessorer(int prosessor){
		prosessor = prosessor;
	}
	// Definerer antall prosessorer Noden skal ha.

	public void settMinne(int min){
		minne = min;
	}
	// Setter minnet til Noden

	public boolean sjekkMinne(int paakrevdMinne){
		return (minne >= paakrevdMinne);
	// Sjekker hver node om de oppfyller kravet for påkrevd minne.
	// Returnerer False dersom det ikke oppfyller kravet og True hvis det gjør det.
	}

	
}