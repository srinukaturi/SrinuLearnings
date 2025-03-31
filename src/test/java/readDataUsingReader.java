import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class readDataUsingReader {

	public static void main(String[] args) throws IOException {
		
		Reader re = new FileReader("C:/Users/saiku/OneDrive/Documents/sample.txt");
		int data = re.read();
		while(data!=-1)
		{
			
			System.out.println((char)data);
			data = re.read();
		}
		
		re.close();
		
		// TODO Auto-generated method stub

	}

}
