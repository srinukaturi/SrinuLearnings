import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsListExample {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("srinu");
		mylist.add("srinu");
		mylist.add("katuri");
		System.out.println(mylist);
		mylist.addFirst("usha");
		System.out.println(mylist);
		mylist.addLast("kiran");
		System.out.println(mylist);
		mylist.add(0, "sadasiva");
		System.out.println(mylist);
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));
		List<String> mylist2 = new ArrayList<String>();
		mylist2.add("lakshmi");
		mylist2.add("gudipalli");
		mylist2.add("nagaraju");
		mylist.addAll(0, mylist2);
		System.out.println(mylist);
		System.out.println(mylist.contains("gudipalli"));
		System.out.println(mylist2.containsAll(mylist));
		System.out.println(mylist2.equals(mylist));
		mylist.forEach(System.out::println);
		System.out.println(mylist.indexOf("gudipalli"));
		System.out.println(mylist.isEmpty());
		Iterator<String> itr = mylist.iterator();
		while(itr.hasNext())
		{
			String myvalue = itr.next();
			System.out.println(myvalue);
		}
		System.out.println(mylist.lastIndexOf("srinu"));
		ListIterator<String> litr = mylist.listIterator();
		while(litr.hasNext())
		{
			String jaffa = litr.next();
			System.out.println(jaffa);
			if(jaffa.equalsIgnoreCase("lakshmi"))
			{
				litr.set("love");
				break;
			}
			
		}
		System.out.println(mylist);
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
