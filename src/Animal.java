import java.util.Scanner;

public class Animal {
	public void Noise(String noise) throws CustomException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the noise you want your animal to make");
			String s = sc.toString();
			s = sc.nextLine();
			System.out.println("The Animal Goes: " + s);
			if (s.equals("")) {
				throw new CustomException();
			} else {
				System.out.println(noise);
			}
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
			this.Noise("________________________________________________");
		}
	}
}