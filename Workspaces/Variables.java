public class Variables{
	//instance variable.
	int counter = 0;

	//Static Variables
	static int totalNumbers = 0;

	//Parameterized Constructor
	public Variables(int value){
		this.counter = value;
	}

	public void printCounter(){
		System.out.println("Value of counter is : "+ this.counter);
	}

	public void printTotalNumbers(){
		System.out.println("Value of counter is : "+ this.totalNumbers);
	}

	public static void main(String args[]){
		Variables obj1 = new Variables(12);
		Variables obj2 = new Variables(15);
		Variables obj3 = new Variables(43);
		
		obj1.printCounter();
		obj2.printCounter();
		obj3.printCounter();
		
		obj2.counter = 158;
		
		
		System.out.println("\n---------------------------------------------");
		
		obj1.printCounter();
		obj2.printCounter();
		obj3.printCounter();
		
		obj3.totalNumbers = 123;
		System.out.println("\n---------------------------------------------");
		obj1.printTotalNumbers();
		obj2.printTotalNumbers();
		obj3.printTotalNumbers();
		
		obj1.totalNumbers = 862;
		System.out.println("\n---------------------------------------------");
		obj1.printTotalNumbers();
		obj2.printTotalNumbers();
		obj3.printTotalNumbers();
	}
}