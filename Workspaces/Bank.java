public class Bank{
		//Instance Variable
		int balance = 0;
		
		//withdraw, deposit, checkBalance
		public int withdraw(int amount){
			//Implementation
		}
		
		//public-> Access Modifier
		// void -> doesn't return anything back
		// deposit -> name of the function
		// Parameters -> 
				//Parameter type and parameter value
		public void deposit(int amount){
			//Implementation			
		}
		
		public int checkBalance(){
			return balance
		}
		
		public Bank(){
			//Default constructor 
		}
		
		public Bank(int amount){
			//Parameterized constructor 
		}		
		
		public static void main(String args[]){			
			Bank icici = new Bank(); //Default constructor 
			Bank hdfc = new Bank(10_000); //Parameterized constructor 
			
			//Bank -> Classname, Reference type
			//icici -> Reference variable / object
			//new -> allocate the memory[HEAP] for the object 
			//Bank()/Bank(10_000) -> constructor, they are used to initialize the object 
			
		}

}