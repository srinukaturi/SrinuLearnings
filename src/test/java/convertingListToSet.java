import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class convertingListToSet {

	public static void main(String[] args) {
		
		List<String> mylist = Arrays.asList("srinu", "katuri", "MCA","MBA");
		Set<String> myset = new HashSet<String>();
		for(String value: mylist)
		{
			myset.add(value);
		}
		
		System.out.println(myset);
		// TODO Auto-generated method stub

	}

}
