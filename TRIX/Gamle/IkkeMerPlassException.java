public class IkkeMerPlassException extends Exception{

	public IkkeMerPlassException(String boktittel){
		super("Det er ikke plass til '" + boktittel + "' i bokhyllen.");
	}
}