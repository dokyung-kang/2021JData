
public class PointTest {

	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point aa = a;
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if (a == b)
			System.out.println("a�� b�� �ּҰ� �ٸ���");
		else
			System.out.println("a�� b�� �ּҰ� ����");
		if (a == aa)
			System.out.println("a�� aa�� �ּҰ� �ٸ���");
		else
			System.out.println("a�� aa�� �ּҰ� ����");
		if (a.equals(b)) 
			System.out.println("a is equal to b");
		else
			System.out.println("a is not equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
		else
			System.out.println("a is not equal to c");
	}

}
