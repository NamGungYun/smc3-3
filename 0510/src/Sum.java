import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b,result = 0;
		
		System.out.println("���� ���� :");
		a = scan.nextInt();
		System.out.println("������ ���� :");
		b = scan.nextInt();
		
		for(int i=0; i<b; i++) {
			result = result + i;
		}
		
		System.out.println(a+"���� "+b+"������ ���� "+(result-1));
		
	}
}
