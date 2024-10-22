import java.util.*;
public class VectorClass
{
	public static void main(String args[])
	{
		Vector <Integer> v1=new <Integer> Vector(4);
		System.out.println("Capacity:"+v1.capacity());
		v1.add(9);
		v1.add(1);
		v1.add(6);
		v1.add(5);
		System.out.println("Values in v1: "+v1);
		Enumeration<Integer>e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(" "+e1.nextElement());
		}
	}
}