
class Generics<T>{
	T t1;
	Generics(T t1){
		this.t1 = t1;
	}
	T get(){
		return t1;
	}
	void printType(){
		System.out.println("Type ="+t1.getClass().getName());
	}

	public static void main(String args[]){
		Generics<Integer> g1 = new Generics<Integer>(10);
		g1.printType();
		int a = g1.get();
		System.out.println("a="+a);
		Generics<Float> g2 = new Generics<Float>(10.2f);
		g2.printType();
		Float b = g2.get();
		System.out.println("b="+b);
	}
}