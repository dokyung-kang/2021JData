
public class Student {
	int id;
	int tuition;
	double gpa;
	
	public Student() {
		
	}
	
	public Student(int id, int tuition, double gpa) {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}
	public int getTuition() {
		return tuition;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public double getGpa () {
		return gpa;
	}

	public int calcScholarship() {
		return 0;
	}
	
	public String toString() {
		return "id=" + id + " tuition=" + tuition + " gpa=" + gpa + " ¿Â«–±›=" + calcScholarship();
	}
}
