
public class ReverseANumberInAnotherWay2 {

	public static void main(String[] args) {
		
		String number = "1234";
		String reverse="";
		char[] myarray = number.toCharArray();
		System.out.println(myarray);
		for(int i=myarray.length-1;i>=0;i--)
		{
			reverse = reverse+myarray[i];
		}
		System.out.println(reverse);
		// TODO Auto-generated method stub

	}

}
