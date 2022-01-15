
public class Test {

	public static void main(String[] args) {
		Professor a = new Professor();
		
		a.setPhone("011-123-1234");
		System.out.println(a.getPhone());
		Person b = a;
		System.out.println(b.getPhone());
	}

}
