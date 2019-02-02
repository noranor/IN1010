class Main{
	public static void main(String[] args) {
		Regneklynge abel = new Regneklynge(12);

		for(int i = 0; i <= 650; i++){
			Node sekstifire = new Node(64, 1);
			abel.settInnNode2(sekstifire);

		}
		for(int i =0; i <= 16; i++){
			Node tusen = new Node(1024, 2);
			abel.settInnNode2(tusen);
		}


	}
}