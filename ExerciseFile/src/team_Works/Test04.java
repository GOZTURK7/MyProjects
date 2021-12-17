package team_Works;

class Person {
	int yas = 9;
	int hız= 100;
	public Person() {
		System.out.println("Person Constructor");
	}
	
	public void talk() {
		System.out.println("First program");
	}
	
}

class Student extends Person {
	String ad = "Kamil";
	public void talk() {
		System.out.println("Second Program");
	}
}

 public class Test04 {
	
	public static void main(String[] args) {

		Person p = new Student();
		p.talk();  //person clasındaki methodu override etti ama;
		System.out.println(p.hız); // variable'larda bir sıkıntı yok yine person'dakileri görebiliyor sadece.
		System.out.println();
	}
 
}
