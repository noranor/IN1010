public class TestBeholder{
	public static void main(String[] args) {

		Beholder<Sirkel> sirkel = new Beholder<Sirkel>();
		Sirkel s = new Sirkel(3.14);
		sirkel.settInn(s);

		Kvadrat k = new Kvadrat(4.5);
		sirkel.settInn(k);
	
	}	
}