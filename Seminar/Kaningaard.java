class Kaningaard{
	private Kanin[] kaniner = new Kanin[100];

	public boolean full(){
		for(int i = 0; i<100; i++){
			if(kaniner[i] == null){
				return false;
			}
		}
	return true; 
	}

	public boolean tom(){
		for(int i = 0; i<100; i++){
			if(kaniner[i] != null){
				return false;
			}
		}
	return true;
	}

	public Kanin finnEn(String navn){
		for(int i = 0; i <100; i++){
			if(kaniner[i].hentNavn().equals(navn)){ // .equals(navn) er det samme som == navn
				return kaninger[i];
			}
		}
	return null;
	}

	public void settInn (Kanin kanin){
		if(!full()){ // If not full()
			for(int i = 0; i<100; i++){
				if(kaniner[i] == null){
					if(finnEn(kanin.hentNavn()) == null){
						kaniner[i] = kanin; // setter inn en kanin
					} else{
						System.out.println("Kaninen er allerede i listen.");
						return; // avslutter metoden og stopper. Void fungerer så lenge det ikke er noen verdi som returnerer.
					}
				}
			}
		}
	}

	public void fjern(String navn){
		if(!tom()){
			for(int i = 0; i <100; i++){
				if(kaniner[i].hentNavn().equals(navn)){
					kaniner[i] = null;
					return;
				}
			}
			System.out.println("Kaninen er ikke i listen");
		}else{
			System.out.println("Listen er tom.");
		}
	}

}