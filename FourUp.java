import java.util.Scanner;
public class FourUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter two numbers");
		
		double a = scanner.nextDouble(); double b = scanner.nextDouble(); 
System.out.println("Which function do you want to use");
String answer = scanner.next();

if (answer.equals("addition")){
	double c = addition (a,b);
	System.out.println(c);
	
}else if(answer.equals("subtraction")){
	double d = subtraction (a,b);
	System.out.println(d);
}else if(answer.equals("multiplication")){
	double e = multiplication (a,b);
	System.out.println(e);
}else if(answer.equals("division")){
	double f = division (a,b);
	System.out.println(f);
}	
	}
public static double addition(double num1, double num2){
	
double sum = num1 + num2;

return sum ;
}

public static double subtraction(double num1, double num2){
	
double sum = num1 - num2;

return sum ;	
}

public static double multiplication(double num1, double num2){
	
double sum = num1 * num2;

return sum ;	
}

public static double division(double num1, double num2){
	
double sum = num1 % num2;

return sum ;	
}
}