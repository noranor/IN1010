public class Hoved{
	public static void main(String[] args) {
		
		Parkeringsplass<Bil> bilplass = new Parkeringsplass<Bil>();
		Parkeringsplass<Motorsykkel> motorsykkelplass = new Parkeringsplass<Motorsykkel>();

		Bil bilen = new Bil(1234, 4);
		Motorsykkel motorsykkelen = new Motorsykkel(5678, 12);

		bilplass.parker(bilen);
		motorsykkelplass.parker(motorsykkelen);

		Bil bil2 = new Bil(6789, 6);

		bilplass.parker(bil2);
		motorsykkelplass.parker(bil2);
	}
}