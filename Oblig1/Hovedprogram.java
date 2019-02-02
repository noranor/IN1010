class Hovedprogram{
	public static void main(String[] args) {
		Regneklynge abel = new Regneklynge(12);
		// Oppretter regneklyngen Abel.

		for (int i = 0; i < abel.regneklynge.size(); i++){
			System.out.println(abel.regneklynge.get(i));
		}
	}
}
/*
		for(int i = 0; i <= 650; i++){
			Node node1 = new Node(64, 1);
/*			
			abel.settInnNode2(node1);
		}

		for(int i = 0; i <= 16; i++){
			Node node2 = new Node(1024, 2);
			abel.settInnNode2(node2);
		}

		System.out.println("Noder med minst 32 GB:");
		System.out.println(abel.noderMedNokMinne(32));

	}
}
*/