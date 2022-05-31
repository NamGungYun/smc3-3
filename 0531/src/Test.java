import java.util.Scanner;

    public class Test {
    	
          public static void main(String[] args) {
        	  
        Scanner scanner = new Scanner(System.in);
        String input = null;
        int num1 = 0, num2 = 0;
        String op = null;
        
        System.out.print("두 정수와 연산자를 입력하시오>>");
        
        input = scanner.nextLine();
        num1 = Integer.parseInt(input);
        
        input = scanner.nextLine();
        num2 = Integer.parseInt(input);
        
        input = scanner.nextLine();
        op = input;

        if(op.equals("+"))
            System.out.printf("%d%n", num1+num2);
        
        if(op.equals("-"))
            System.out.printf("%d%n", num1-num2);
        
        if(op.equals("*"))
            System.out.printf("%d%n", num1*num2);
        
        if(op.equals("/"))
            System.out.printf("%d%n", num1/num2);
        
        scanner.close();

    }

}