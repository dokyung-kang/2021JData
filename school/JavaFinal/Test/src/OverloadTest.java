
public class OverloadTest {
	public static void main(String[] argv) {
		new OverloadTest().test();
	}
	private void test() {
		Fruits fruits = new Apple();
		System.out.println(fruits.getName());
	}
}
