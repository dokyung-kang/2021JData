
public class Circle extends Shape{
	public void draw() {
		System.out.println("원 그리기");
		System.out.println("원 이동 좌표");
	}
	public void move(int dx, int dy) {
		super.move(dx, dy);
	}
}
