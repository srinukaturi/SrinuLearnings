import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class arrayToHashMapStreams {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("srinu");
		al.add("katuri");
		al.add("mca");
		
		System.out.println(al);
		
		HashMap<String, Integer> mymap = al.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1,e2)->e1, HashMap::new));
		System.out.println(mymap);
		// TODO Auto-generated method stub

	}

}
