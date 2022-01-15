
public class Undergraduate extends Student {
	int year;
	
	public Undergraduate() {
		
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}

	public int calcScholarship() {
		if(gpa >= 3.0)
			return (int)(tuition * 0.3);
		else
			return 0;
	}
	
	public String toString() {
		
		return super.toString() + " ÇÐ³â=" + year;
	}
}
