import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertHashTableValuesAsArrayList {

	public static void main(String[] args) {
		
		
		Hashtable<String, Integer> mytable = new Hashtable<String, Integer>();
		mytable.put("srinu", 55);
		mytable.put("usha", 11);
		mytable.put("suragani", 23);
		
		System.out.println(mytable);
		
		List<Integer> mylist = new ArrayList<Integer>();

		Set<Entry<String, Integer>> values = mytable.entrySet();
		for(Entry<String, Integer> entry: values)
		{
			mylist.add(entry.getValue());
		}
		
		System.out.println(mylist);
		
		
	}

}
