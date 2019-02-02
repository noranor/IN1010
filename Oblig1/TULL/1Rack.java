import java.util.Arrays; 
import java.util.Iterator; 

class 1Rack{
	private int maxNoder;
	private Node[] rackListe;

	public Rack(int maxNoder){
		maxNoder = maxNoder;
		rackListe = new Node[maxNoder];
	}

	public Node[] settInnNode1(Node node){
		//Node nyNode = new Node(minne, prosessor);
		for(int i = 0; i <= maxNoder;){ 
			if(rackListe[i] == null){
				rackListe[i] = node;
			}
			else{
				Node[] rackListe = new Node[maxNoder];
				rackListe[0] = node;
			}
			i++;
		}
		return rackListe;
	}
}

/*
	public int prosessorerPrRack(){
		int prosPrRack; 
		for(int i = 0; i < rackListe.length(); i++){
			// TODO: .length()-funksjonen fungerer ikke. Finn en annen metode å få tak på størrelsen til rackListe. 

			int prosPrPack = prosPrRack + nyNode.getProsessor();
		}
		return prosPrPrack;
	}

	public Node[] settInnNode1(int minne, int prosessor) { 
		Node nyNode = new Node(minne, prosessor);
		if(full()){
			rackListe.add(nyNode);
		}else{
			Node[] rackListe = new Node[maxNoder];
			rackListe.add(nyNode);
		}
		return rackListe;
	} 

	public int NoderMedNokMinne(int paakrevdMinne){
		int nokMinne;

		for(int i = 0; i < rackListe.length(); i++){
			if(nyNode.sjekkMinne(paakrevdMinne)){ 
				nokMinne ++;
			}
		}
		return nokMinne;
	}
}

*/

