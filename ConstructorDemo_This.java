//this
class MathOperations{
	
	int num1;
	int num2;
	
	{
		System.out.println("init block invoked!!");
	}
	
	MathOperations(int num1, int num2){
		System.out.println("Constructor invoked!!");
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	static int result;
	
	void add(){
		result = num1 + num2;
		System.out.println("Add Result : "+result);
	}
	
	void sub(){
		result = num1 - num2;
		System.out.println("Sub Result : "+result);
	}
	
}

class ConstructorDemo_This{

	public static void main(String[] args){
		
		MathOperations mo1 = new MathOperations  (10,20);
		mo1.add();
		System.out.println(mo1.num1);
		System.out.println(mo1.num2);
		
	}
}