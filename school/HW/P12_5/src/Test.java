import java.security.PKCS12Attribute;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student(0, 0, 0);
		Undergraduate s2 = new Undergraduate();
		Graduate s3 = new Graduate();
		
		System.out.println("학생의 정보를 입력한다");
		System.out.print("학번은?");
		s1.setId(sc.nextInt());
		System.out.print("등록금은?");
		s1.setTuition(sc.nextInt());
		System.out.print("평균등급?");
		s1.setGpa(sc.nextDouble());
		System.out.println(s1.toString());
		
		System.out.println("학부생의 정보를 입력한다");
		System.out.print("학번은?");
		s2.setId(sc.nextInt());
		System.out.print("등록금은?");
		s2.setTuition(sc.nextInt());
		System.out.print("평균등급?");
		s2.setGpa(sc.nextDouble());
		System.out.print("학년은?");
		s2.setYear(sc.nextInt());
		System.out.println(s2.toString());

		System.out.println("대학원생의 정보를 입력한다");
		System.out.print("학번은?");
		s3.setId(sc.nextInt());
		System.out.print("등록금은?");
		s3.setTuition(sc.nextInt());
		System.out.print("평균등급?");
		s3.setGpa(sc.nextDouble());
		System.out.print("연구실?");
		s3.setLab(sc.next());
		System.out.println(s3.toString());
	}

}
