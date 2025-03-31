import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HowToRemoveDuplicatesInArrayLiostWithoutUsingLoop {

	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("srinu");
		mylist.add("srinu");
		mylist.add("usha");
		mylist.add("usha");
		System.out.println(mylist);
		
		for(int i=0;i<mylist.size();i++)
		{
			for(int j=i+1;j<mylist.size();j++)
			{
				if(mylist.get(i).equalsIgnoreCase(mylist.get(j)))
				{
					mylist.remove(j);
				}
			}
		}
		
		for(String value: mylist)
		{
			System.out.println(value);
		}
		
		
		
		Set<String> myset = new HashSet<String>();
		
		
		for(String value: mylist)
		{
			myset.add(value);
		}
		
		System.out.println(myset);
		// TODO Auto-generated method stub

	}

}
