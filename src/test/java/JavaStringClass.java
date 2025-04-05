
import java.lang.String;
import java.lang.Object;
public class JavaStringClass {

	public static void main(String[] args) {
		
		 String name ="srinu";
		 String name1 = new String("srinu");
		 System.out.println(name==name1);
		// TODO Auto-generated method stub
		 
		 String s1 = "usha";
		 String s3 = "kiran";
		 String s2 = new String("kiran");
		 s2 = s2.intern();
         System.out.println(s3==s2);
	}

}
