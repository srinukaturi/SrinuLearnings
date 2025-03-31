import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaExceptionExample {

	public static void main(String[] args) throws IOException {
		
		String root = System.getProperty("user.dir");
		System.out.println(root);
		String path = root + "/sample.txt";
		
		System.out.println(path);
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		for(int i=0;i<3;i++)
		{
			String line = br.readLine();
			if(line==null)
			{
			System.out.println("Reached end of line");
			break;
			
			}
			System.out.println(line);
		}
		
		fr.close();
		// TODO Auto-generated method stub

	}

}
