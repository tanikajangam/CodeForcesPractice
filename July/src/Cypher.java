import java.util.Scanner;
public class Cypher {

	public int findOrigPosition(int finalPos, String seq) {
		
		for(int i = 0; i < seq.length(); i++) {
			if(seq.substring(i,i+1).equals("D")) {
				if(finalPos == 9) {
					finalPos = 0;
				}
				else {
					finalPos++;
				}
			}
			else if(seq.substring(i,i+1).equals("U")) {
				if(finalPos == 0) {
					finalPos = 9;
				}
				else {
					finalPos--;
				}
			}
		}
		return finalPos;
		
	}
	
	public static void main(String[]  args) {
		Cypher one = new Cypher();
		Scanner scan = new Scanner(System.in);
		int numWheels = 0;
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			numWheels = scan.nextInt();
			scan.nextLine();
			String[] finalPositionsArray = (scan.nextLine()).split(" ");
			for (int x = 0; x < numWheels; x++) {
				String[] s = (scan.nextLine()).split(" ");
				System.out.print(one.findOrigPosition(Integer.parseInt(finalPositionsArray[x]), s[1]) + " ");
			}
			System.out.println();
		}
		
	}
}
