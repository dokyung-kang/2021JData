package game;

public class DiceTest {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		for (int i = 1; ; i++) {
			d1.setValue();
			d2.setValue();
			System.out.print(i + "차: 첫번째" + d1.toString());
			System.out.println(", 두번째 " + d2.toString());
			
			if (d1.getValue() == d2.getValue())
				break;
		}
		System.out.println("Dice 게임이 종료되었습니다.");

	}

}
