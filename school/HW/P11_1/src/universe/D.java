package universe;
import planet.A;

public class D extends A{
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		//System.out.println(def); //���� package������
		//System.out.println(prv); //���� class������
		
		//F fobj = new F();  //���� package��
		//fobj.accessTest(); //���� package��
	}
}
