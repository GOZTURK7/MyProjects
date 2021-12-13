package day29_staticBlocks_PassByValue;

public class Test {
	
	static String s = "B";
	
	static {
		
		System.out.print(Test.s); // 1 Test Clasındaki s static variable'ını yazdır = "B"
	}
	
	{
		System.out.print("A");  
		
	}
	/*1) Block that does not have name like below is called "Instance Initializer" 
	 * which only get called when new objects will be created its like DefaultConstructor 
	 * or noArg Constructor.
					{
					    add(11);
					}
					*/
	Test (String s) {
		System.out.println(s);
	}
	

	public static void main(String[] args) { // 2 main çalıştı D yazdırdı 3'üncü olarak new Test("C")

		System.out.print("D");
		new Test("C");

		
		
	}

}
