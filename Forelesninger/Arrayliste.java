class Arrayliste<T> implements Liste<T> {
	@SuppressWarnings("unchecked")
	private T[] data = (T[])new Object[10];
	private int iBruk = 0;

	public void set(int pos, T x) {
		data[pos] = x;
	}

	
	public T get(int pos) {
		return data[pos];
	}

	public int size() {
		return iBruk;
	}

	public T remove(int pos) {
		T res = data[pos];
		for (int i = pos+1;  i < iBruk;  i++)
			data[i-1] = data[i];
		iBruk--;
		return res;
	}

	public void add(T x) {
		if (iBruk == data.length) {
		@SuppressWarnings("unchecked")
		T[] ny = (T[])new Object[2 *iBruk];
		}


		for (int i = 0;  i < iBruk;  i++){
			ny[i] = data[i];
			data = ny; 
		}
		
		data[iBruk] = x;
		iBruk++;
	}
}