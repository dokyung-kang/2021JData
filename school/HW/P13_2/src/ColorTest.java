
public class ColorTest {

	public static void main(String[] args) {
		Prn9090 p = new Prn9090();
		String s = "This is a printer driver";
		
		p.print(s);
		System.out.println();
		p.printCMYK(s);
	}

}
