package team_Works;

public class Exercise_For_Loop_Asal_Sayı {

	public static void main(String[] args) {

		int num = 20;

		for (int i = 2; i < num; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.print(i + ", ");
			}
			
		}

	}

}
