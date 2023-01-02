import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ques3 {
	public static String winnerOfGame(int[] array1,int[] array2,int rounds) {
		int max=0,player=0;
		for(int i=0;i<rounds;i++) {
			if(array1[i]>array2[i] && max<(array1[i]-array2[i])) {
				player=1;
				max=array1[i]-array2[i];
			}
			else if(array1[i]<array2[i] && max<(array2[i]-array2[i])) {
				player=2;
				max=array2[i]-array1[i];
			}
		}
		return player+" "+max;
	}
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String  line;        
    String[] inputs;
	int[] player1Scores=new int[5];
	int[] player2Scores=new int[5];
	int rounds=sc.nextInt();
	for(int i=0;i<rounds;i++) {
		line = br.readLine();
		inputs = line.trim().split("\\s+");
		player1Scores[i]=Integer.parseInt(inputs[0]);
		player2Scores[i]=Integer.parseInt(inputs[1]);
	}
	System.out.println(winnerOfGame(player1Scores,player2Scores,rounds));
}
}
