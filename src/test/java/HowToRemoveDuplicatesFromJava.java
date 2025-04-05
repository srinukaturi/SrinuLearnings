
public class HowToRemoveDuplicatesFromJava {

	public static void main(String[] args) {
		
		String name ="java tutorials java tutorials";
		String[] myarray = name.split(" ");
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
			{
				if(myarray[i].equalsIgnoreCase(myarray[j]))
				{
					myarray[j]="";
				}
			}
		}
		for(String x: myarray)
		{
			System.out.println(x);
		}
		// TODO Auto-generated method stub

	}

}
