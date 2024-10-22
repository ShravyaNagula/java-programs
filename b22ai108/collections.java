import java.util.*;
public class collections
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	ArrayList <Integer> al=new ArrayList<>();
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		 int l=sc.nextInt();
		al.add(l);
	}
	System.out.println(al);
	al.add(108);
	System.out.println(al);
	System.out.println(al.get(3));
	al.remove(2);
	System.out.println(al.size());
	Collections.sort(al);
	System.out.println(al);
	sc.close();
	}
}