//public -> Access modifier
//class -> keyword -> contains properties -> variables and methods
//WelcomeToJava -> Class Name
public class WelcomeToJava{
	//JVM -> entry point to any program -> main ->
	//static -> For accessing static members we don't need any need to creating the objects.
	//void -> This method won't return anything
	//main -> entry point method name
	//Parameter ->
		//1. Parameter type -> String[]
		//2. Parameter name args
	//main we can pass parameters..
	public static void main(String[] myArgs){
		//System -> Class
			//-> static PrintStream out
			//-> PrintStream
					//println()
		System.out.println("Welcome to the world of Object Oriented and Secure programming language!");
		for(String myCustomArg : myArgs){
			System.out.println("Argument is : "+myCustomArg);
		}
	}
}