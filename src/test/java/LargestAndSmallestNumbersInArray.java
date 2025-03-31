import java.util.Arrays;

public class LargestAndSmallestNumbersInArray {

	public static void main(String[] args) {
		int[] array = {56,12,89,1,66};
		int temp;
		Arrays.sort(array);
		System.out.println("Largest number in the array: "+array[array.length-1]);
		System.out.println("Smallest number in the array: "+array[0]);
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
					
				}
			}
		}
		System.out.println("Smallest element in the array: "+array[0]);
		System.out.println("Smallest element in the array: "+array[array.length-1]);
		
		// TODO Auto-generated method stub

	}
	
	

}
