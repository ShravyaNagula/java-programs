import java.util.TreeMap;
import java.util.Map;
public class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap <Integer,String> treemap = new TreeMap<>();
		//Insertion
		treemap.put(1,"Tea");
		treemap.put(3,"Coffee");
		treemap.put(2,"Milk");
		System.out.println("TreeMap after insertion(sorted by keys): "+treemap);
		//Searching
		int searchkey=3;
		if(treemap.containsKey(searchkey))
		{
			System.out.println("TreeMap contains key "+searchkey+"With value: "+treemap.get(searchkey));
		}
		else
		{
			System.out.println("Key "+searchkey+"not found in TreeMap.");
		}
		//Deletion
		treemap.remove(3);
		System.out.println("TreeMap after deleting key 3: "+treemap);
		//Traversing
		System.out.println("Traversing TreeMap");
		treemap.forEach((key,value)->{
			System.out.println("Key: "+key+",value: "+value);
		});
	}
}