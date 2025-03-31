
public class FindDuplicateWordsInAString {

	public static void main(String[] args) {
		
		String words = "srinu katuri srinu usha katuri";
		String[] myarray = words.split("\\s");
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
			{
				if(myarray[i].equals(myarray[j]))
				{
					System.out.println("Duplicate elements are: "+myarray[i]);
				}
			}
		}
		//System.out.println(myarray);
		// TODO Auto-generated method stub

	}

}
