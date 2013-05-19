import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int go = 0;
		while (go==0){
			
		Scanner A = new Scanner(System.in);
		double num1, num2, answer;
		System.out.println("Would you like to add,subtract, multiply, or divide?");
		System.out.println("1. Addition");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		int option;
		option = A.nextInt();
		if(option==1){
			System.out.println("Enter a two numbers: ");
			num1 = A.nextDouble();
			num2 = A.nextDouble();
			answer = num1 + num2;
			System.out.println(answer);
		}
		if(option==2){
			System.out.println("Enter a two numbers: ");
			num1 = A.nextDouble();
			num2 = A.nextDouble();
			answer = num1 - num2;
			System.out.println(answer);
		}
		if(option==3){
			System.out.println("Enter a two numbers: ");
			num1 = A.nextDouble();
			num2 = A.nextDouble();
			answer = num1 * num2;
			System.out.println(answer);
		}
		if(option==4){
			System.out.println("Enter a two numbers: ");
			num1 = A.nextDouble();
			num2 = A.nextDouble();
			answer = num1 / num2;
			System.out.println(answer);
		}else{
			System.exit(0);
		}
		}
	}
		
}
