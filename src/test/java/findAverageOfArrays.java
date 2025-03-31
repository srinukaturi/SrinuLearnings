import java.util.Arrays;
import java.util.OptionalDouble;

public class findAverageOfArrays {

	public static void main(String[] args) {
		
		double[] myarray = {15,22,1,32,67,89,03};
		double sum=0;
		for(double value: myarray)
		{
			sum = sum+value;
		}
		
		System.out.println("Average of arrays is:"+sum/myarray.length);
		// TODO Auto-generated method stub
		
		OptionalDouble avg = Arrays.stream(myarray).average();
		System.out.println(avg.getAsDouble());

	}

}
