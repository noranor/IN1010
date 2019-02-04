class Hovedprogram{
	public static void main(String[] args) {
		Regneklynge abel = new Regneklynge(12);
		// Oppretter regneklyngen Abel.

		for(int i = 0; i <= 650; i++){
			Node node1 = new Node(64, 1);			
			abel.settInnNode2(node1);
		}

		for(int i = 0; i <= 16; i++){
			Node node2 = new Node(1024, 2);
			abel.settInnNode2(node2);
		}

		System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne2(32));
		System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne2(64));
		System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne2(128));

		//System.out.println("\nAntall prosessorer: " + abel.antProsessorer());
		//System.out.println("Antall racks: " + abel.antRacks());
	}
}
 