import java.util.Scanner;
import java.io.*;
/* 
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try 
		{
			int c = a / b;
			System.out.println(c);
		} 
		catch (ArithmeticException ref)
		{
			
			System.out.println("Second number must be greater then Zero");
		}
		 finally
		{
			System.out.println("I am finally block");
		}
		System.out.println("hy i am ");
	}
} */

// class Main {

/* public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
	char ch = (char) z.read();
	System.out.println(ch);
} 
}*/
/*class abc // enter class name (here abc is class name)
{
public static void main(String arg[])throws IOException 
{
	//InputStreamReader a = new InputStreamReader(System.in);
    BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
    char ch = (char)z.read();
	System.out.println(ch);


	// InputStreamReader ch1 = new InputStreamReader(System.in);
	/* BufferedReader ch1 = new BufferedReader(new InputStreamReader(System.in));
    char b = (char)ch1.read();
	// System.out.println(b); 
	
	System.out.println("hello world");
}
}*/
// class Simple1 {
// 	public static void main(String args[]) {
// 		Simple1 s = new Simple1();
// 		String s1 = "hello";
// 		// int a =2;
// 		System.out.println(s instanceof Simple1);// true
// 		System.out.println(s1 instanceof objrct);// true
// 	}
// }
class AssertionExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		assert x > y : "x should be greater than y";

		System.out.println("x is greater than y");
	}
}
