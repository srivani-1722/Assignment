import java.util.Scanner;

public class Ques1 {
	public static int sumOfdidgits(int num) {
		int sum=0;
		while(num > 0)  
		{  
		sum = sum + num%10;  
		num = num / 10;  
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		int[] numbers =new int[testCases];
		for(int i=0;i<testCases;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int j=0;j<testCases;j++) {
			System.out.println(sumOfdidgits(numbers[j]));
		}
	}

}
