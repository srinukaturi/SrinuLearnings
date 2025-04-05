
public class HowToManipulateArray {

	public static void main(String[] args) {
		
		String[] myarray = {"sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
		String[] outputarray = new String[myarray.length];
		for(int i=0;i<myarray.length;i++)
		{
			outputarray[i] = myarray[i].substring(0,3);
		}
		
		for(String x: outputarray)
		{
			System.out.println(x);
		}
		// TODO Auto-generated method stub

	}

}
