import java.util.ArrayList;

public class M{
	public static void main(String[] args) {

		ArrayList<Katt> katteliste = new ArrayList<Katt>();

		Katt katt1 = new Katt("Lilli", 3);
		Katt katt2 = new Katt("Gudrun", 12);
		Katt katt3 = new Katt("Misty", 5);
		Katt katt4 = new Katt("Pus", 8);

		katteliste.add(katt1);
		katteliste.add(katt2);
		katteliste.add(katt3);
		katteliste.add(katt4);

		Katt eldste = katteliste.get(0);
		for(Katt katt : katteliste){
			if(katt.compareTo(eldste) > 0){
				eldste = katt;
			}
		}

		System.out.println("Eldst: " + eldste);
	}
}