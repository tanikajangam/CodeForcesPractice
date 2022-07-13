import java.util.HashSet;
import java.util.Scanner;
public class ICPCBallons {

	public int CalculatePoints(String s) {
		int sum = 0;
		HashSet<String> hs = new HashSet<String>();
		String[] ss = s.split("");
		for (int i = 0; i < ss.length; i++){
			if(hs.contains(ss[i])) {
				sum++;
			}
			else {
				sum +=2;
				hs.add(ss[i]);
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		ICPCBallons b = new ICPCBallons();
		Scanner scan = new Scanner(System.in);
			
		int num = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < num; i++) {
			scan.nextLine();
			System.out.println(b.CalculatePoints(scan.nextLine()));

		}
	}
}
