import org.apache.commons.lang3.StringUtils;

public class removeWhiteSpacesInJava {

	public static void main(String[] args) {
		
		String name = "  srini vasa r a o ";
		
		name = StringUtils.deleteWhitespace(name);
	
		
		System.out.println(name);
		
		String name1 = "  srini vasa r a o ";
		
			
		System.out.println(name1.trim());
		
		String name2 = "  srini vasa r a o ";
		
		
		System.out.println(name.replaceAll("\\s", ""));
		
		String newWord = "srinu "
		+
		"\t usha ra n i"
		+
		"kiran kuma";
		
		String updatedWord ="";
		
		for(int i=0; i<newWord.length();i++)
		{
			if((newWord.charAt(i)!=' ')&&(newWord.charAt(i)!='\t'))
			{
				updatedWord = updatedWord+newWord.charAt(i);
			}
		}
		
		System.out.println(updatedWord);
		
		// TODO Auto-generated method stub

	}

}
