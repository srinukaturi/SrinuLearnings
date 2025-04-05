
public class HowToFindANumberStartsWith {
	
	static int[] resultArray = new int[9];
	
	
	public static void main(String[] args) {
		
		HowToFindANumberStartsWith obj = new HowToFindANumberStartsWith();
		
		int[] myarray = {1,34,71,124,332,178,192,456};
		
		for(int i=0;i<myarray.length;i++)
		{
			int value = myarray[i];
			if(String.valueOf(value).startsWith("1"))
			{
				resultArray[i]=value;
			}
		}
		for(int value: resultArray)
		{
			System.out.println(value);
		}
		
		
		System.out.println(resultArray);
		// TODO Auto-generated method stub

	}

}
