package universe;
import planet.A;

public class E {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		//System.out.println(aobj.pro);  //���� package��
		//System.out.println(aobj.def);  //���� package��
		//System.out.println(aobj.prv);  //���� class��
		
		//F fobj = new F();  //���� package��
		//fobj.accessTest(); //���� package��
	}
}
