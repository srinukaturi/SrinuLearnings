
public class isEven {
	
	public static boolean isEven(int number)
	{
		if((number==0) || (number==1))
		{
			
			return false;
		}
		if((number>=2)&&(number%2==0))
		{
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		System.out.println("given number is prime:"+isEven(3));
		// TODO Auto-generated method stub

	}

}
