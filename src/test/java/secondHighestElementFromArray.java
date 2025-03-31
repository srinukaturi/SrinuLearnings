import java.util.Arrays;

public class secondHighestElementFromArray {

	public static void main(String[] args) {
		
		int temp;
		int[] myarray = {1,99,78,32};
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
			{
				if(myarray[i]>myarray[j])
				{
					temp = myarray[i];
					myarray[i] = myarray[j];
					myarray[j] = temp;
					
				}
			}
			
		}
		
		System.out.println(myarray[1]);

	}

}
