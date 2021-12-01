package universe;
import planet.A;

public class D extends A{
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		//System.out.println(def); //같은 package에서만
		//System.out.println(prv); //같은 class에서만
		
		//F fobj = new F();  //같은 package만
		//fobj.accessTest(); //같은 package만
	}
}
