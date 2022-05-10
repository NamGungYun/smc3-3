import java.util.Scanner;
import java.util.Random;

public class Number {
	public static void main(String[] args) {
        System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int []arr=new int[10];
        int max = 50, min = 1, fail = 1;
        Random random = new Random();
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = random.nextInt(max + min) + min;
        	System.out.println(arr[i]);
        }
        for(int j=0; j<arr.length; j++) {
        	if(num == arr[j]) {
        		System.out.println("당첨! 일치하는 숫자가 있습니다.");
        		fail = 0;
        		break;
        	}
        }
        
        if(fail == 1) {
        	System.out.println("꽝! 다음 기회에~");
        }
        
        
	}
}


