public class Main{
	public static void main(String[] args) {

		Liste<Integer> liste = new SortertLenkeliste<Integer>();
        liste.leggTil(1);
        liste.leggTil(3);
        liste.leggTil(2);
        liste.leggTil(3);
        liste.leggTil(5);

        System.out.println(liste);

        liste.fjern(0);

        System.out.println(liste);

        /*
        liste.leggTil("Element 0");
        liste.leggTil("Element 1");
        liste.leggTil("Element 2");
        liste.leggTil("Element 3");
        liste.leggTil("Element 4");
        System.out.println(liste);
        liste.sett(0, "nyVerdi 0");
        liste.sett(2, "nyVerdi 2");
        System.out.println(liste);
        System.out.println("Skal nå fjerne");
        liste.fjern(3);
        System.out.println(liste);
        liste.fjern(3);
        System.out.println(liste);


       // System.out.println("nyVerdi 0 --> " + liste.hent(0));
        //System.out.println("nyVerdi 2 --> " + liste.hent(2));
        //System.out.println("Fjernet 'Element 3' --> " + liste.fjern(3));
        //System.out.println("Fjernet 'Element 4' --> " + liste.fjern(3));


        liste.leggTil("NyttElement");
        System.out.println(liste);

        //System.out.println("NyttElement --> " + liste.hent(3));

		/*
		Liste<Integer> liste = new Lenkeliste<Integer>();
		liste.leggTil(1);
		liste.leggTil(2);
		liste.leggTil(3);
		liste.leggTil(4);

		System.out.println(liste.fjern(1));
		System.out.println(liste.fjern(1));
		liste.leggTil(7);
		// 0, 1. 100, 2, 3
		System.out.println(liste);
		System.out.println("Størrelse: " + liste.stoerrelse());
		*/


	}
}
    