
public class Rectangle extends Shape{
	public void draw() {
		System.out.println("사각형 그리기");
		System.out.println("사각형 이동 좌표");
	}
	public void move(int dx, int dy) {
		super.move(dx, dy);
	}
}
