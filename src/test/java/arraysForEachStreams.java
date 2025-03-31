import java.util.Arrays;
public class arraysForEachStreams {
	
	public static void sample(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		String[] names = {"srinu", "katuri", "mca"};
		
		Arrays.stream(names).forEach(arraysForEachStreams::sample);
		
		// TODO Auto-generated method stub

	}

}
