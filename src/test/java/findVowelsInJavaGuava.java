import com.google.common.base.CharMatcher;

public class findVowelsInJavaGuava {
	
	static boolean bool1;
	
	public static boolean isVowel(char c)
	{
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A' || c=='E' 
				|| c=='I' || c=='O' || c=='U';
	}

	public static void main(String[] args) {
		
		
		int count1 =0;
		String name = "srinivasa rao";
		int count = CharMatcher.anyOf("aeiou").countIn(name);
		System.out.println(count);
		
		for(int i=0;i<name.length();i++)
		{
			bool1 = isVowel(name.charAt(i));
			if(bool1==true)
			{
				count1++;
			}
		}
		
		System.out.println("number of vowels in a given string is:"+count1);
		
		
		
		// TODO Auto-generated method stub

	}

}
