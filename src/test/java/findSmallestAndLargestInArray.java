
public class findSmallestAndLargestInArray {

	public static void main(String[] args) {
		
		int[] myarray = {23, 11, 67, 90, 55};
		int largest = myarray[0];
		int smallest = myarray[0];
		
		for(int i=0;i<myarray.length;i++)
		{
			if(myarray[i]>largest)
			{
				largest = myarray[i];
			}
			else if(myarray[i]<smallest)
				
			{
				smallest = myarray[i];
			}
		}
		
		System.out.println("smallest is: "+smallest+"\nLargest is: "+largest);
		
		int temp;
		int[] myarray1 = {23,5,95,12,78};
		for(int i=0;i<myarray1.length;i++)
		{
			for(int j=i+1;j<myarray1.length;j++)
			{
				if(myarray1[i]>myarray1[j])
				{
					temp = myarray1[i];
					myarray1[i] = myarray1[j];
					myarray1[j] = temp;
				}
			}
		}
		
		System.out.println("lar is: "+myarray1[myarray1.length-1]);
		System.out.println("small is "+myarray1[0]);
		
		// TODO Auto-generated method stub

	}

}
