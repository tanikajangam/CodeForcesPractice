import java.util.Scanner;
public class Watermelon {

	
	public String checkWeight(int number) {
		for (int i = 2; i <= number/2; i += 2) {
			if ((number % i) %2 == 0) {
				return "YES";
			}
		}
		return "NO";
	}
	public static void main(String arsp[]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		Watermelon n = new Watermelon();
		System.out.println(n.checkWeight(num));
		
	}
}
