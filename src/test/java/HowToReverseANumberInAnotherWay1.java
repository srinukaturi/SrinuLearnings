
public class HowToReverseANumberInAnotherWay1 {

	public static void main(String[] args) {
		
		String number = "1234";
		String reverse = "";
		for(int i=number.length()-1;i>=0;i--)
		{
			reverse = reverse+number.charAt(i);
		}
		System.out.println(reverse);
		// TODO Auto-generated method stub

	}

}
