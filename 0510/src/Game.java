import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String hand;
		
		int game=0;
		
		int computer = (int)(Math.random()*3);
		
		System.out.println("���� ���� ��!");
		hand = scan.next();
		
		if(hand.equals("����")){
			game = 0;
		}
		else if(hand.equals("����")){
			game = 1;
		}
		else if(hand.equals("��")){
			game = 2;
		}
		else {
			System.out.println("�ùٸ� ���� �Է��Ͻÿ�");
			System.exit(0);
		}
		
		
		if(computer == 0){
			if(game == 0){
				System.out.println("����\n");
				System.out.println("����");
			}
			if(game == 1){	
				System.out.println("����\n");
				System.out.println("�̰��");
			}
			if(game == 2){	
				System.out.println("����\n");
				System.out.println("����");
			}
		}
		if(computer == 1){
			if(game == 0){
				System.out.println("����\n");
				System.out.println("����");
			}
			if(game == 1){	
				System.out.println("����\n");
				System.out.println("����");
			}
			if(game == 2){	
				System.out.println("����\n");
				System.out.println("�̰��");
			}
		}
		if(computer == 2){
			if(game == 0){
				System.out.println("��\n");
				System.out.println("�̰��");
			}
			if(game == 1){	
				System.out.println("��\n");
				System.out.println("����");
			}
			if(game == 2){	
				System.out.println("��\n");
				System.out.println("����");
			}
		}
		
	}
}