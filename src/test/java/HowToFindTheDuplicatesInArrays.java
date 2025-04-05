import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class HowToFindTheDuplicatesInArrays {
	
	static int count=1;
	
    
    
	public static void main(String[] args) {
		Map<Integer, Integer> mymap = new HashMap<Integer,Integer>();
		
		int[] myarray = {1,23,1,43,23,11,11,43,43,1,8};
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
			{
				
				if(myarray[i]!=0 && myarray[i]==myarray[j])
				{
					
					try {
						myarray[j]=0;
						mymap.put(myarray[i], count++);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}
			count=1;
			
			
			
			
		}
		System.out.println(mymap);
		

	}

}
