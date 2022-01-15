
public class TV {
	String color;
	boolean power;
	int channel;
	public void power() {
		if (power == true)
			power = false;
		else
			power = true;
	}
	public void channleUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}
