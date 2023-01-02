import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String  line = br.readLine();        
	    String[] inputs = line.trim().split("\\s+");
		Scanner sc=new Scanner(System.in);
		int withDrawAmt=Integer.parseInt(inputs[0]);
		float accntBalance=Float.parseFloat(inputs[1]);
		if(withDrawAmt%5!=0) {
			System.out.printf("%.2f",accntBalance);
		}
		else if(withDrawAmt%5==0) {
			if((withDrawAmt+0.50) <accntBalance) {
				System.out.printf("%.2f",accntBalance-withDrawAmt-0.50);
			}
			else {
				System.out.printf("%.2f",accntBalance);
			}
		}
		
	}
}
