
public class palindrome {

	public static void main(String[] args) {
		
		boolean value = true;
		String word = "racecarr";
		for(int i=0;i<word.length()/2;i++)
		{
			if(word.charAt(i)!=word.charAt(word.length()-1-i))
			{
				System.out.println("given word is not palindrome");
				value = false;
				break;
			}
			
			
		}
		
		if(value==true)
		{
			System.out.println("given word is plaindrome");
		}
		// TODO Auto-generated method stub

	}

}
