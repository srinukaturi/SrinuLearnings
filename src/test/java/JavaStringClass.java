
import java.lang.String;
import java.lang.Object;
public class JavaStringClass {
	
	final int x =10;

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
         
         
         
         
         JavaStringClass obj1 = new JavaStringClass();
         
         System.out.println(obj1.x);
         
	}

}
