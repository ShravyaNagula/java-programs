import java.util.*;
public class Employee
{
	public static void main(String args[])
	{
		String id;
		String Name;
		Employee(String eid,String n)
		{
			id=eid;
			Name=n;
		}
		void display()
		{
			System.out.println("Employee ID:"+id+"Employee Name:"+Name);
		}
	}
}