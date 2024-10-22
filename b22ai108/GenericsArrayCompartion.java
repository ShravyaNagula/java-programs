class GenericsArrayCompartion<T>{
	<T extends Number>double Avg(T t1)
	{
		 double sum = 0.0;
        int n = t1.length;

        for (int i = 0; i < n; i++) { 
            sum += t1[i].doubleValue(); 
        }

        double tavg = sum / n;
		return tavg;
    }
	
	
	public static void main(String args[]){
		Integer[] i = {1, 2, 3, 4, 5};
		GenericsArray g1 = new GenericsArray();
		System.out.println("avg ="+);
		
	}
}