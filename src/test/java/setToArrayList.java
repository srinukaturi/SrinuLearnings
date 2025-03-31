import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class setToArrayList {

	public static void main(String[] args) {
		
		Set<String> myset = new HashSet<String>();
		myset.add("srinu");
		myset.add("srinu");
		myset.add("katuri");
		System.out.println(myset);
		
		List<String> srinu = List.copyOf(myset);
		System.out.println(srinu);
		// TODO Auto-generated method stub

	}

}
