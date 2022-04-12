import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int i=0;
		int j=1;
		int[] arr = new int [5];
		int max = arr[0];
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i<arr.length; i++) {
			System.out.println((i+1)+ "번 입력: "+"\n");
			arr[i] = sc.nextInt();
		}
		
		for(i = 0; i<5; i++) {
			if(arr[i] > max) {
				max = arr[i];
				j = i+1;
			}
		}
		
		System.out.println(j + "번째, " + max);
		
	}
}
