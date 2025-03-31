
public class PrintNameThousandTimesWithoutForLoop {

	public static void main(String[] args) {
		
		String name = "srinu";
		String rep = "i";
		rep = rep.replaceAll("i", "iiiiiiiiii");
		rep = rep.replaceAll("i", "iiiiiiiiii");
		rep = rep.replaceAll("i", "iiiiiiiiii");
		rep = rep.replace("i", name+"\n");
		System.out.println(rep);
		// TODO Auto-generated method stub

	}

}
