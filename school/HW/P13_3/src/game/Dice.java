package game;
import java.util.*;
public class Dice {
	private int value;
	public Dice() {
		value = 1;
	}
	public int roll() {
		Random rd = new Random();
		int r = rd.nextInt(6) + 1;
		return r;
	}
	public int getValue() {
		return value;
	}
	public void setValue() {
		value = roll();
	}
	public String toString() {
		return "?ֻ???=" + value;
	}
}
