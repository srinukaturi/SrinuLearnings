
public class javaPrimeExample {
	
	public static boolean isPrime(int number)
	{
		int count=0;
		if((number==0)||(number==1))
		{
			return false;
		}
		else if(number>=2)
		{
			for(int i =1;i<=number;i++)
			{
				if(number%i==0)
				{
					count++;
				}
				
				if(count>=3)
				{
					return false;
					
				}
				
					
				
			}
			
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Given number is prime: "+isPrime(7));
		// TODO Auto-generated method stub

	}

}
