import java.util.HashSet;
import java.util.Set;

public class HowToRemoveDuplicateWordsInArray {

	public static void main(String[] args) {
		
		String name ="java tutorials java tutorials";
		
		String[] myarray = name.split(" ");
		System.out.println(myarray);
		Set<String> myset = new HashSet<String>();
		for(int i=0;i<myarray.length;i++)
		{
			myset.add(myarray[i]);
		}
		
		for(String se: myset)
		{
			System.out.println(se);
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
