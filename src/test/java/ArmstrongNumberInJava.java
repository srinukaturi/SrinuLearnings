
public class ArmstrongNumberInJava {
	
	static int total=0;
	static int a;
	
	public static boolean armstrong(int number)
	{
		int originalNumber;
		originalNumber = number;
		while(number!=0)
		{
			
			a = number%10;
			total = total+(a*a*a);
			number = number/10;
		}
		if(originalNumber==total)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		
		System.out.println("is Armstrong: "+armstrong(150));
		// TODO Auto-generated method stub

	}

}
