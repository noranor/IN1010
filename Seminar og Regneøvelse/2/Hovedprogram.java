class Hovedprogram{

	public static void main(String[] args) {
		Person rolf = new Person("Rolf", 17);
		System.out.println(rolf);

		Emne emne1 = new Emne("IN1010", "Objektorientert programmering, Java", false);

		System.out.println(emne1);

		MAStudent ma = new MAStudent("Daniel", 24), rolf;
		ma.registrer(emne1);
		System.out.println(ma);
	}
}
