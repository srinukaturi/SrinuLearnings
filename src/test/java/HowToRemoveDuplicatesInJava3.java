import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowToRemoveDuplicatesInJava3 {

	public static void main(String[] args) {
		
		String name = "java tutorials java tutorials";
		String[] myarray = name.split(" ");
		System.out.println(myarray);
		List<String> mylist = new ArrayList<String>(Arrays.asList(myarray));
		for(int i =0;i<=mylist.size()-1;i++)
		{
			for(int j=i+1;j<=mylist.size()-1;j++)
			{
				if(mylist.get(i).equalsIgnoreCase(mylist.get(j)))
				{
					System.out.println("Duplicate words are: "+mylist.get(j));
				}
			}
		}
		

	}

}
