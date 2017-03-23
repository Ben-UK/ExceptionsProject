import java.io.IOException;
import java.util.Scanner;

public class Cat extends Mammal {
	public void Noise(String noise) throws CustomException {
		try {
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the noise you want your Cat to make");
				String s = sc.toString();
				s = sc.nextLine();
				System.out.println("The Cat Goes: " + s);
				if (s.equals("")) {
					throw new CustomException();
				} else {
					System.out.println(noise);
				}
			}
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
			this.Noise("________________________________________________");
		}
	}
}