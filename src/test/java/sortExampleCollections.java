import java.util.ArrayList;
import java.util.Collections;

public class sortExampleCollections {
	
	public static void main(String[] args)
	{
	
	ArrayList<Integer> li = new ArrayList<Integer>();
	li.add(65);
	li.add(1);
	li.add(99);
	li.add(22);
	li.add(67);
	
	Collections.sort(li,(o1,o2)->(o1<o2)? -1: (o1>o2)? 1:0);
	
	System.out.println(li);
	
	
	
	}
	

}
