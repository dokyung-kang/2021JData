import java.util.*;
public class ErrTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.info();
		cat.info();
		System.out.println(dog.breed);
		System.out.println(cat.breed);
	}
	public static class Cat {
		String breed = "Persian";
		void info() {
			System.out.println(this.breed);
		}
	}

}



