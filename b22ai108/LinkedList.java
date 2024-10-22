import java.util.*;
public class linkedlist
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList <Integer>();
		System.out.print("Enter n value:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			ll.add(x);
		}
		for(Integer k:ll)
		{
			System.out.println(k);
		}
		ll.add(1);
		System.out.println(ll);
	}
}	