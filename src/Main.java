import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Animal a = new Animal();
		Mammal m = new Mammal();
		Cat c = new Cat();

		a.Noise("________________________________________________\n\n");
		m.Noise("________________________________________________\n\n");
		c.Noise("________________________________________________\n\n");
		System.out.println("Now please have a lie down in a dark room\nto get over the excitment of playing:\nThe Animal Noise Game!\n\n   System is now exiting...");
		System.exit(0);
	}
}