package englishLessonsQuestions;

import java.util.Scanner;

public class Do_While_loop {

	public static void main(String[] args) {

		/*
		 Usuer is "admin , password is "pwd123"
		 ask user to enter username and password
		 user should see "enter your user name and password" message
		 if he enters correct credentials he should get " You are in your account!" message
		 Otherwise, he should see "Enter your username and password" message 3 times
		 After 3 times he should get "Your account is bloced" mesaage.
		  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int enteringCount = 1;
		String pwd = "pwd123";
		String user = "admin";
		
		
		do {
			System.out.println("Please enter your user name and password");
			String enteredPwd=scan.next();
			String enteredUser=scan.next();
			if(pwd.equals(enteredPwd) && user.equals(enteredUser)) {
				System.out.println("You are in your account");
				break;
			}if(enteringCount==3) {
				System.out.println("Your account is blocked");
				break;
			}			
			enteringCount++;
		
				
		}while(true); // !!!!!!!!Burada WHİLE(TRUE) ile İNFİNİTE LOOP yapıyoruz ve bunu kırmak için BREAK Kullanıyoruz
		
		scan.close();
	}	

}
