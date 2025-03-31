
public class isOdd {
	
	public static boolean isOdd(int number)
	{
		if(number==0)
		{
			return false;
		}
		else if((number>0)&&(number%2!=0))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println("given number is odd: "+isOdd(3));
		
		
		// TODO Auto-generated method stub

	}

}
