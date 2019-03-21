public class Islandshest extends Hest implements KanToelte, KanPasse{
	
	public Islandshest(String n, int a){
		super(n, a);
	}

	public void toelt(){
		System.out.println("Hesten tølter - firtaktig gangart.");
	}

	public void pass(){
		System.out.println("Hester passer - sveveaktig gangart.");
	}
}