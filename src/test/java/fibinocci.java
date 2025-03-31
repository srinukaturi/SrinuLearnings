
public class fibinocci {

	public static void main(String[] args) {
		int firstNumber=0;
		int secondNumber=1;
		int thirdNumber;
		
		System.out.print(firstNumber+","+secondNumber);
		
		for(int i=2;i<=10;i++)
		{
			thirdNumber = firstNumber+secondNumber;
			System.out.print(","+thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		// TODO Auto-generated method stub

	}

}
