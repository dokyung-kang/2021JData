import java.security.PKCS12Attribute;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student(0, 0, 0);
		Undergraduate s2 = new Undergraduate();
		Graduate s3 = new Graduate();
		
		System.out.println("�л��� ������ �Է��Ѵ�");
		System.out.print("�й���?");
		s1.setId(sc.nextInt());
		System.out.print("��ϱ���?");
		s1.setTuition(sc.nextInt());
		System.out.print("��յ��?");
		s1.setGpa(sc.nextDouble());
		System.out.println(s1.toString());
		
		System.out.println("�кλ��� ������ �Է��Ѵ�");
		System.out.print("�й���?");
		s2.setId(sc.nextInt());
		System.out.print("��ϱ���?");
		s2.setTuition(sc.nextInt());
		System.out.print("��յ��?");
		s2.setGpa(sc.nextDouble());
		System.out.print("�г���?");
		s2.setYear(sc.nextInt());
		System.out.println(s2.toString());

		System.out.println("���п����� ������ �Է��Ѵ�");
		System.out.print("�й���?");
		s3.setId(sc.nextInt());
		System.out.print("��ϱ���?");
		s3.setTuition(sc.nextInt());
		System.out.print("��յ��?");
		s3.setGpa(sc.nextDouble());
		System.out.print("������?");
		s3.setLab(sc.next());
		System.out.println(s3.toString());
	}

}
