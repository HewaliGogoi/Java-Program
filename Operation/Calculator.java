package Operation;
import java.util.Scanner;
public class Calculator
{
	public static void display()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		double first=reader.nextDouble();
		double second=reader.nextDouble();
		System.out.println("Enter the operator(+,-,*,/):");
		char operator=reader.next().charAt(0);
		double result;
		switch(operator)
		{
			case'+':
				result=first+second;
				break;
			case'-':
				result=first-second;
				break;
			case'*':
				result=first*second;
				break;
			case'/':
				result=first/second;
				break;
			default:
				System.out.println("Error! Operator is not correct");
			return;
		}
		System.out.printf("%.1f %c %.1f=%.1f",first,operator,second,result);
	}
}