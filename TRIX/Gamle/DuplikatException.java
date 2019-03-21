public class DuplikatException extends Exception{

	public DuplikatException(String boktittel){
		super("'" + boktittel + "' finnes allerede i bokhyllen!");
	}
}