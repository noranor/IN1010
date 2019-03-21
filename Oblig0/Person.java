public class Person{
	private Bil3 bilen; //Deklarering variabel med type Bil3

	public Person(Bil3 bil){ // Konstruktør
		bilen = bil;
	}
	
	public void tildelBil(Bil3 bil){
		bil = bilen;
	}

	public void skrivBilnummer(){
		String bilnummer = bilen.hentNummer();
		System.out.println(bilnummer);
	}
}