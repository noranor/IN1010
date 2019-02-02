public class BilBruk3{
	public static void main(String[] args) {
		
		Bil3 personBil = new Bil3();
		personBil.settNummer("HB94883");

		Person roger = new Person(personBil);
		roger.tildelBil(personBil);
		roger.skrivBilnummer();
	}
}