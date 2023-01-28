import java.util.*;
class MyQueue
{
	private LinkedList ll=new LinkedList();
	public void put(Object o)
	{
		ll.addLast(o);
	}
	public Object get()
	{
		return ll.removeFirst();
	}
	public boolean empty()
	{
		return ll.isEmpty();
	}
	public static void main(String[] args)
	{
		MyQueue mq=new MyQueue();
		mq.put("one");
		mq.put("two");
		mq.put("three");
		
		System.out.println(mq.get());
		System.out.println(mq.get());
		System.out.println(mq.get());
		System.out.println(mq.empty());
	}
}