class GenericsArray<T extends Number> {
    T[] t1;

    GenericsArray(T[] t2) {
        t1 = t2;
    }

    public void avg() {
        double sum = 0;
        int n = t1.length;

        for (int i = 0; i < n; i++) { 
            sum += t1[i].doubleValue(); 
        }

        double tavg = sum / n;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + tavg);
    }

    public static void main(String args[]) {
        Integer[] T1 = {1, 2, 3, 4, 5}; 
        GenericsArray<Integer> g1 = new GenericsArray<Integer>(T1);
        g1.avg();
    }
}
