import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class concurrentModificationException {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("srinu");
		mylist.add("usha");
		mylist.add("katuri");
		
		
			
		Iterator<String> itr = mylist.iterator();
			
		
		while(itr.hasNext())
		{
			String value = itr.next();
			if(value.equalsIgnoreCase("srinu"))
			{
				System.out.println(mylist.getFirst());
			}
			
		}
		
		
		
		System.out.println(mylist);
		// TODO Auto-generated method stub

	}

}
