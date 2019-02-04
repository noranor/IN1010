class Test{
	public static void main(String[] args) {
		Node nynode = new Node(64, 2);
		Node noden = new Node(31, 4);
		Node node1 = new Node(64, 2);
		Node node2 = new Node(64, 2);

		System.out.println("________NODE_________");
		System.out.println("True -> " + nynode.nokMinne(32));
		System.out.println("False -> " + noden.nokMinne(32));
		System.out.println("2 -> " + nynode.antallProsessorer());
		System.out.println("4 -> " + noden.antallProsessorer());
		System.out.println("4 -> " + nynode.hentAlleNoder());
/*
		Rack rack = new Rack(3);
		Rack nyttRack = new Rack(3);
		rack.settInnNode1(noden);
		rack.settInnNode1(nynode);

		System.out.println("________RACK_________");
		System.out.println("True -> " + rack.ledigPlass());
		System.out.println("2 -> " + rack.getAntNoder());
		System.out.println("6 -> " + rack.prosessorerPerRack());
		System.out.println("1 -> " + rack.noderMedNokMinne1(32));
		System.out.println("2 -> " + rack.noderMedNokMinne1(31));
		System.out.println("0 -> " + rack.noderMedNokMinne1(67));
		System.out.println("2 -> " + rack.hentAlleRacks());
*/
		Regneklynge klynge = new Regneklynge(3);
		klynge.settInnNode2(nynode);
		klynge.settInnNode2(noden);
		klynge.settInnNode2(node1);

		// Her skal det bli 2 racks i regneklynge
		klynge.settInnNode2(node2);

		System.out.println("_____REGNEKLYNGE_____");
		System.out.println("10 -> " + klynge.antProsessorer());
		System.out.println("4 -> " + klynge.noderMedNokMinne2(30));
		System.out.println("3 -> " + klynge.noderMedNokMinne2(32));
		System.out.println("2 -> " + klynge.antRacks());




	}
}