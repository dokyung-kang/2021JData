package universe;
import planet.A;

public class E {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		//System.out.println(aobj.pro);  //같은 package만
		//System.out.println(aobj.def);  //같은 package만
		//System.out.println(aobj.prv);  //같은 class만
		
		//F fobj = new F();  //같은 package만
		//fobj.accessTest(); //같은 package만
	}
}
