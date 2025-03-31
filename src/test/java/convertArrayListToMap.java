import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class convertArrayListToMap {

	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<String>(Arrays.asList("Srinu", "Usha", "katuri"));
		HashMap<String, Integer> mymap = new HashMap<String, Integer>();
		
		for(String name: mylist)
		{
			mymap.put(name, name.length());
		}
		
		System.out.println(mymap);
		
		// TODO Auto-generated method stub

	}

}
