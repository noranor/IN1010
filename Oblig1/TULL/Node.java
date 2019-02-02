public class Node {
	private int minne;
	private int prosessor;

	public Node(int prosessor, int minne){
		prosessor = prosessor;
		minne = minne;
	}

	public boolean sjekkMinne(int paakrevdMinne){
		return (minne >= paakrevdMinne);

	}
	public int getProsessor(){
		return prosessor;
	}
	
}