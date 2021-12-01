
public class Test {

	public static void main(String[] args) {
		Melon m1 = new Melon(120, 5000, 1, "naju");
		Melon m2 = new Melon(1, 1, 1, "0");
		
		m2.setCal(100);
		m2.setCost(7000);
		m2.setKg(2);
		m2.setInfo("jeju");
		
		System.out.println(m1.toString());
		System.out.println();
		System.out.println(m2.toString());
	}

}
