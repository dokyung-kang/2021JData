package out;

import planet.*;
import universe.*;

public class T {

	public static void main(String[] args) {
		B bobj = new B();
		bobj.accessTest();
		
		E eobj = new E();
		//eobj.accessTest(); //E�� A�� �ڽ��� �ƴ϶� ���� ������
		
		//F fobj = new F(); //class�� public�� �ƴ� �ٸ� package
	}

}
