
public class javaFinallyExample {

	public static void main(String[] args) {
		
		int i = 10;
		int count;
		
		try
		{
			System.out.println("inside the try block...");
			count = i/0;
			
			//throw new RuntimeException("test");
		}
		catch(NullPointerException e)
		{
			System.out.println("inside the catch block...");
		}
		finally
		{
			System.out.println("inside the finally block...");
		}
		// TODO Auto-generated method stub

	}

}
