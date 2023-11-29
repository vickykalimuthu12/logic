package Scanner;

import java.util.Scanner;
public class Log
{
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Registration form:");
	System.out.println("Enter your name: ");
	String name = scanner.nextLine();
	System.out.println("Enter your age: ");
	int age = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter your mobile number");
	long mobile = scanner.nextLong();
	scanner.nextLine();

	System.out.println("Enter Email Id: ");
	String email = scanner.nextLine();
	System.out.println("Enter Your Village: ");
	String Village = scanner.nextLine();
	
	System.out.println("\nRegistration details: ");
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);
	System.out.println("Mobile number: "+mobile);
	System.out.println("Email:"+email);
	System.out.println("Village: "+Village);
	scanner.close();
}

}
