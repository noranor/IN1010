public class Parkeringshus<T>{

	private T element1;
	private T element2;
	
	private Parkeringsplass<T>[] etasje1;
	private Parkeringsplass<T>[] etasje2;

	public Parkeringshus(T element1, T element2){
		this.element1 = element1;
		this.element2 = element2;

		Parkeringsplass<T>[] etasje1 = (Parkeringsplass<T>) new Object[10];



	}
}