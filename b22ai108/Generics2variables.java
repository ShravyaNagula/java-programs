class Generics2variables<T,A>{
	T t1;
	A a1;
	Generics2variables(T t1,A a1){
		this.t1 = t1;
		this.a1 = a1;
	}
	T getT1(){
		return t1;
	}
	A getA1(){
		return a1;
	}
	void printType(){
		System.out.println("Type is :"+t1.getClass().getName());
		System.out.println("Type is :"+a1.getClass().getName());
	}
	
	public static void main(String args[]){
		Generics2variables<Integer,String> g1 = new Generics2variables<Integer,String>(10,"Hello");
		g1.printType();
		
		
		
	}
}