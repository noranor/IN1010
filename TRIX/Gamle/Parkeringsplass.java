public class Parkeringsplass<T>{
	private T kjoeretoy;
	private boolean ledig = true;

	public void parker(T kjoeretoy){
		if(ledig){
			this.kjoeretoy = kjoeretoy;
			ledig = false;
		}else{
			System.out.println("Plassen er opptatt. Finn en anne plass.");
		}
	}

	public void forlat(){
		kjoeretoy = null;
		ledig = true;
	}
}