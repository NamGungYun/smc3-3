import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b,result = 0;
		
		System.out.println("시작 숫자 :");
		a = scan.nextInt();
		System.out.println("마지막 숫자 :");
		b = scan.nextInt();
		
		for(int i=0; i<b; i++) {
			result = result + i;
		}
		
		System.out.println(a+"부터 "+b+"까지의 합은 "+(result-1));
		
	}
}
