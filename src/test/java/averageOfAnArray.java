import java.util.Arrays;
import java.util.OptionalDouble;

public class averageOfAnArray {

	public static void main(String[] args) {
		
		int total = 0;
		int[] myarray = {9,12,36,22,14,25,34};
		for(int i: myarray)
		{
			total = total+i;
		}
		System.out.println("Total is: "+total);
		System.out.println("Average is: "+ (total/myarray.length));
		
		OptionalDouble odl = Arrays.stream(myarray).average();
		System.out.println(odl.getAsDouble());
		// TODO Auto-generated method stub

	}

}
