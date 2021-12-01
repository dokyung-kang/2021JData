
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
		return "Melon의 정보\n" + "칼로리: " + cal + "\n가격: " + cost + "\n중량: " + kg + "\n정보: " + info;
	}
}
