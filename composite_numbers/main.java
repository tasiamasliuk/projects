import java.util.Scanner;

// Print all the composite numbers till number
public class Program
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.println(number);
		System.out.print("Composite numbers: 1");
		
		for(int i = 2; i <= Math.sqrt(number); i++){
		    if (number % i == 0){
		        if (i * i == number){
		            System.out.print(" "+i);
		        }
		        else{
		            System.out.print(" "+i);
		            System.out.print(" "+number/i);
		        }
		    }
		}
		System.out.print(" "+number);
	}
}
