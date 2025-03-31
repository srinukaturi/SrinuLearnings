import java.util.HashMap;
import java.util.Map;

public class copyOneMapToAnother {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mymap = new HashMap<String, Integer>();
		HashMap<String, Integer> mymap1 = new HashMap<String, Integer>();
		
		mymap.put("srinu", 1);
		mymap.put("usha", 2);
		mymap.put("katuri", 3);
		
		mymap.put("gagan", 6);
		mymap.put("sanvi", 5);
		mymap.put("sai", 4);
		
		for(Map.Entry<String, Integer> entry: mymap.entrySet())
		{
			mymap1.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(mymap1);
		
		
		HashMap<String, Integer> mymap2 = new HashMap<String, Integer>();
		HashMap<String, Integer> mymap3 = new HashMap<String, Integer>();
		
		mymap2.put("abc", 7);
		mymap2.put("def", 8);
		mymap2.put("ghui", 9);
		
		mymap3.put("jkl", 10);
		mymap3.put("mno", 11);
		mymap3.put("pqr", 12);
		
		mymap2.putAll(mymap3);
		System.out.println(mymap2);
		// TODO Auto-generated method stub

	}

}
