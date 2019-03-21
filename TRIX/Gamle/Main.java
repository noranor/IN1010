public class Main{
	public static void main(String[] args) {
		EngelskFullblodshest nick = new EngelskFullblodshest("Nick", 25);
		PasoFino ronny = new PasoFino("Ronny", 43);
		Islandshest hatir = new Islandshest("Hatir", 33);

		System.out.println("--- Nick ---");
		nick.skritt();
		nick.trav();
		nick.galopp();

		System.out.println("--- Ronny ---");
		ronny.skritt();
		ronny.trav();
		ronny.galopp();
		ronny.toelt();

		System.out.println("--- Hatir ---");
		hatir.skritt();
		hatir.trav();
		hatir.galopp();
		hatir.toelt();
		hatir.pass();
	}
}