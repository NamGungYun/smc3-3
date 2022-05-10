import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String hand;
		
		int game=0;
		
		int computer = (int)(Math.random()*3);
		
		System.out.println("가위 바위 보!");
		hand = scan.next();
		
		if(hand.equals("가위")){
			game = 0;
		}
		else if(hand.equals("바위")){
			game = 1;
		}
		else if(hand.equals("보")){
			game = 2;
		}
		else {
			System.out.println("올바른 값을 입력하시오");
			System.exit(0);
		}
		
		
		if(computer == 0){
			if(game == 0){
				System.out.println("가위\n");
				System.out.println("비겼다");
			}
			if(game == 1){	
				System.out.println("가위\n");
				System.out.println("이겼다");
			}
			if(game == 2){	
				System.out.println("가위\n");
				System.out.println("졌다");
			}
		}
		if(computer == 1){
			if(game == 0){
				System.out.println("바위\n");
				System.out.println("졌다");
			}
			if(game == 1){	
				System.out.println("바위\n");
				System.out.println("비겼다");
			}
			if(game == 2){	
				System.out.println("바위\n");
				System.out.println("이겼다");
			}
		}
		if(computer == 2){
			if(game == 0){
				System.out.println("보\n");
				System.out.println("이겼다");
			}
			if(game == 1){	
				System.out.println("보\n");
				System.out.println("졌다");
			}
			if(game == 2){	
				System.out.println("보\n");
				System.out.println("비겼다");
			}
		}
		
	}
}