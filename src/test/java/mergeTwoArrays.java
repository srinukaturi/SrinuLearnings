import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;
public class mergeTwoArrays {

	public static void main(String[] args) {
		
		String[] myarray1 = {"srinu", "Katuri", "usha", "Suragani"};
		String[] myarray2 = {"jhansi", "mca", "mba", "bsc"};
	    Stream<String> st1 =	  Arrays.stream(myarray1);
	    Stream<String> st2 =	  Arrays.stream(myarray2);
	    String[] uarray =  Stream.concat(st1, st2).toArray(size->new String[size]);
	    for(String m: uarray)
	    {
	    	System.out.println(m);
	    }
	    
	    String[] arr1 = ObjectArrays.concat(myarray1, myarray2, String.class);
	    for(String me: arr1)
	    {
	    	System.out.println(me);
	    }
	    
	    int[] i1 = {1,2,3,4,5};
	    int[] i2 = {6,7,8,9,10};
	    
	    
	    int[] i3 =   Ints.concat(i1,i2);
	    for(int i: i3)
	    {
	    	System.out.println(i);
	    }
	    
	   
		

	}

}
