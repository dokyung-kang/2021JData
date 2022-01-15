
public class Graduate extends Student{
	String lab;
	
	public Graduate() {
		
	}
	
	public void setLab(String lab) {
		this.lab = lab;
	}
	public String getLab() {
		return lab;
	}
	
	public int calcScholarship() {
		if(gpa >= 3.5)
			return (int)(tuition * 0.5);
		else
			return (int)(tuition * 0.1);
	}
	
	public String toString() {
		
		return super.toString() + " ¿¬±¸½Ç=" + lab;
	}
}
