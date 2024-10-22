import java.util.HashMap;
import java.util.Map;
public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap <Integer,String> hashmap = new HashMap<>();
		//Insertion
		hashmap.put(1,"Tea");
		hashmap.put(2,"Coffee");
		hashmap.put(3,"Milk");
		System.out.println("HashMap after insertion: "+hashmap);
		//Searching
		int searchkey=2;
		if(hashmap.containsKey(searchkey))
		{
			System.out.println("HashMap contains key "+searchkey+"With value: "+hashmap.get(searchkey));
		}
		else
		{
			System.out.println("Key "+searchkey+"not found in HashMap.");
		}
		//Deletion
		hashmap.remove(3);
		System.out.println("HashMap after deleting key 3: "+hashmap);
		//Traversing
		System.out.println("Traversing HashMap");
		for(Map.Entry<Integer,String>entry:hashmap.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+",value: "+entry.getValue());
		}
	}
}