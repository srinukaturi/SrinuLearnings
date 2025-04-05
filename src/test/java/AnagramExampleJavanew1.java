import java.util.Arrays;

public class AnagramExampleJavanew1 {

	public static void main(String[] args) {
		
		String anagram1 = "listen";
		String anagram2 = "silent";
		
		char[] myarray1 = anagram1.toCharArray();
		char[] myarray2 = anagram2.toCharArray();
		
		Arrays.sort(myarray1);
		Arrays.sort(myarray2);
		
		System.out.println(Arrays.equals(myarray1, myarray2)
				);
		// TODO Auto-generated method stub

	}

}
