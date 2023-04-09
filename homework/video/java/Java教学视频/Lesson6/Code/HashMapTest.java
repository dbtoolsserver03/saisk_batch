import java.util.*;
class HashMapTest
{
	public static void printElements(Collection c)
	{
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		HashMap hm=new HashMap();
		hm.put("one","zhangsan");
		hm.put("two","lisi");
		hm.put("three","wangwu");
		
		System.out.println(hm.get("one"));
		System.out.println(hm.get("two"));
		System.out.println(hm.get("three"));
		
		
		Set keys=hm.keySet();
		System.out.println("Key:");
		printElements(keys);
		
		Collection values=hm.values();
		System.out.println("Value:");
		printElements(values);
		
		Set entry=hm.entrySet();
		//printElements(entry);
		Iterator it=entry.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
	}
}