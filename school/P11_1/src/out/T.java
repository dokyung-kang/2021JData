package out;

import planet.*;
import universe.*;

public class T {

	public static void main(String[] args) {
		B bobj = new B();
		bobj.accessTest();
		
		E eobj = new E();
		//eobj.accessTest(); //E는 A의 자식이 아니라 값을 못받음
		
		//F fobj = new F(); //class가 public이 아님 다른 package
	}

}
