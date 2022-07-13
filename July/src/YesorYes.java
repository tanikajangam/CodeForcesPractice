import java.util.Scanner;
public class YesorYes {
	
	public String YesOrYes(String s) {
		
		if(s.equalsIgnoreCase("Yes")) {
			return "Yes";
		}
		else {
			return "No";
		}
		
	}
	
	public static void main(String args[]) {
		YesorYes x = new YesorYes();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < num; i++) {
			System.out.println(x.YesOrYes(scan.nextLine()));
		}
	}
	
}
