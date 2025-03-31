import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Streams;

public class differentWaysOfCreatingHashMap {
	
	public static HashMap<String, String> mympa;
	
	static
	{
		mympa= new HashMap<String, String>();
		mympa.put("srinu", "katuri");
		mympa.put("usha", "katuri");
		mympa.put("kiran", "katuri");
		
		System.out.println(mympa);
	}

	public static void main(String[] args) {
		
		Map<String, String> mymap = new HashMap<String, String>();
		HashMap<String, String> mymap1 = new HashMap<String, String>();
		
		Map<String, String> mymap5 = Stream.of(new String[][]{
			{"gagn","s"},
			{"sanvi","s"},
			
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		System.out.println(mymap5.get("gagn"));
		
		// TODO Auto-generated method stub

	}

}
