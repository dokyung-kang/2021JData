
public class PrinterTest{

	public static void main(String[] args) {
		Printable p1 = new SPrinter();
		Printable p2 = new LPrinter();
		String s = "This is a printer driver";
		p1.print(s);
		System.out.println();
		p2.print(s);
	}

}
