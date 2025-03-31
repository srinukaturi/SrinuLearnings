import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExamplenew {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>(Arrays.asList("srinu, katuri, usha, srinu"));
		System.out.println(alist);
		Set<String> myset = new HashSet<String>(alist);
		System.out.println(myset);
		// TODO Auto-generated method stub

	}

}
