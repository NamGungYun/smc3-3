import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0,b = 0, result = 0;
		
		System.out.println("���� ���� : ");
		a = scan.nextInt();
		System.out.println("������ ���� : ");
		b = scan.nextInt();
		
		for(int i=a; i<=b; i++) {
			result = i + result;
		}
		
		System.out.println(a+"���� "+b+"������ ���� "+result);
		
	}

}
