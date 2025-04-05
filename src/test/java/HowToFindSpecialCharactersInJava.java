
public class HowToFindSpecialCharactersInJava {

	public static void main(String[] args) {
		
		int smallCount=0;
		int capCount = 0;
		int specialCount=0;
		int numCount=0;
		String name = "abcABCDEFG!@1234";
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>='A'&&name.charAt(i)<='Z')
			{
				capCount++;
			}
			else if(name.charAt(i)>='a'&&name.charAt(i)<='z')
			{smallCount++;
				
			}
			else if(name.charAt(i)>='0'&&name.charAt(i)<='9')
					{
				numCount++;
					}
			else
			{
				specialCount++;
				
			}
		}
		
		System.out.println(capCount);
		System.out.println(smallCount);
		System.out.println(numCount);
		System.out.println(specialCount);
		
		// TODO Auto-generated method stub

	}

}
