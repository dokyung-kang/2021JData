
public class TVTest {

	public static void main(String[] args) {
		TV[] tv = new TV[3];
		
		for (int i = 0; i < 3; i++) {
			tv[i] = new TV();
			tv[i].channel = 10;
			tv[i].channleUp();
			System.out.println("tvArr[" + i + "].channel=" + tv[i].channel);
		}		
	}

}
