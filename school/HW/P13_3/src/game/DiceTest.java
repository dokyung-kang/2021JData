package game;

public class DiceTest {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		for (int i = 1; ; i++) {
			d1.setValue();
			d2.setValue();
			System.out.print(i + "��: ù��°" + d1.toString());
			System.out.println(", �ι�° " + d2.toString());
			
			if (d1.getValue() == d2.getValue())
				break;
		}
		System.out.println("Dice ������ ����Ǿ����ϴ�.");

	}

}
