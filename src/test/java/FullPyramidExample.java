
public class FullPyramidExample {

	public static void main(String[] args) {
		
		int lines = 5;
		for(int i=1; i<=5; i++)
		{
			
			for(int k=1;k<=lines-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub

	}

}
