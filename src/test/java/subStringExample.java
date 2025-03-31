
public class subStringExample {
	
	public static boolean isSubString(String s1, String s2)
	{
		return s1.matches("(.*)"+s2+"(.*)");
	} 
	
	public static boolean isSubString1(String s3, String s4)
	{
		return s3.contains(s4);
	}
	
	public static boolean isSubString2(String s4, String s5)
	{
		return s5.substring(0).contains(s4);
	}

	public static void main(String[] args) {
		
		System.out.println(isSubString("srinu katuri", "suragani"));
		System.out.println(isSubString1("srinu katuri", "katuri"));
		System.out.println(isSubString2("srinu kiran", "kiran"));
		
		
		// TODO Auto-generated method stub

	}

}
