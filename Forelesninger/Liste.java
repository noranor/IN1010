interface Liste {
	int size();
	void add(Object x);
	void set(int pos, Object x);
	T get(int pos);
	T remove(int pos);
}