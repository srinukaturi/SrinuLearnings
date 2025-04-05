
public class JavaPalindromeExampleNew1 {

	public static void main(String[] args) {
		
		String name ="racecarr";
		Boolean bool1 = true;
		if(name.length()/2!=0)
		{
		for(int i=0;i<name.length()/2;i++)
		{
			if(name.charAt(i)!=name.charAt(name.length()-i-1))
			{
				System.out.println("given number is not plaindrome");
				bool1 = false;
				break;
			}
		}
		// TODO Auto-generated method stub
		}
		else
		{
			System.out.println("given number is not palindrome");
			bool1 = false;
		}
		if(bool1)
		{
			System.out.println("given number is palindrome");
		}
	}

}
