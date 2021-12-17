package day32_varargs_StringBuilder;

public class Varargs_Test {
	
	public void Varargs_Test(int x, String...y) {
		
		System.out.println(y[y.length-x]+ " ");
	}
	

	public static void main(String[] args) {

		new Varargs_Test().Varargs_Test(1, "Hello");
		new Varargs_Test().Varargs_Test(2, "Hello", "Hi");
		
		
		
		
		
	}

}
