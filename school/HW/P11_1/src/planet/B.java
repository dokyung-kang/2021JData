package planet;

public class B extends A{
	public void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		//System.out.println(prv); //private 지정자는 해당 class만
		
		F fobj = new F();
		fobj.accessTest();
	}
}
