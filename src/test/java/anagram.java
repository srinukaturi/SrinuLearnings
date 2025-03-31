import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		String word1 = "silent";
		String word2 = "listent";
		char[] myarray1 = word1.toCharArray();
		char[] myarray2 = word2.toCharArray();
		Arrays.sort(myarray1);
		Arrays.sort(myarray2);
		if(Arrays.equals(myarray1, myarray2)==true)
		{
			System.out.println("Given words are anagarms");
		}
		else
		{
			System.out.println("given words are not anagrams");
		}
		// TODO Auto-generated method stub

	}

}
