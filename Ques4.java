import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques4 {
	public static int numReverse(int num) {
		int reverse=0;
		while(num != 0)   
		{  
		reverse = reverse * 10 + num%10;  
		num = num/10;  
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<testCases;i++) {
			list.add(sc.nextInt());
		}
		list.forEach(num -> System.out.println(numReverse(num)));
	}

}
