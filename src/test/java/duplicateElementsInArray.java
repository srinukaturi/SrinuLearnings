import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateElementsInArray {

	public static void main(String[] args) {
		String[] myarray = {"srinu", "katuri", "srinu", "usha", "usha"};
		
		//brute force
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
			{
				if(myarray[i]==myarray[j])
				{
					System.out.println(myarray[i]);
				}
			}
		}
		
		System.out.println("-------------------");
		
		//using set
		Set<String> myset = new HashSet<String>();
		for(String value: myarray)
		{
			if(myset.add(value)==false)
			{
				System.out.println(value);
			}
		}
		
		Map<String, Integer> mymap = new HashMap<String, Integer>();
		
		
		
		for(String value1: myarray)
		{
			Integer count = mymap.get(value1);
			if(mymap.get(value1)==null)
			{
				mymap.put(value1, 1);
			}
			else
			{
				mymap.put(value1, ++count);
			}
		}
		
		System.out.println(mymap);
		
		System.out.println("-------------------");
		
		Set<Entry<String, Integer>> entryset = mymap.entrySet();
		for(Entry<String, Integer> entry: entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
			
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
