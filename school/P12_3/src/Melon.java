
public class Melon extends Food {
	String info;
	
	public Melon() {
		
	}
	public Melon(int cal, int cost, int kg, String info) {
		super.cal = cal;
		super.cost = cost;
		super.kg = kg;
		this.setInfo(info);
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
	
	public String toString() {
		return "Melon�� ����\n" + "Į�θ�: " + cal + "\n����: " + cost + "\n�߷�: " + kg + "\n����: " + info;
	}
}
