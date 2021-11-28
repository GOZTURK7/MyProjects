package RandomExercises;

public class Asal_Sorgu_Tekrar {

	public static void main(String[] args) {

		for (int i = 1000; i < 10000; i++) {

			int a = i / 1000;
			int b = i / 100 % 10;
			int c = i / 10 % 10;
			int d = i % 10;

			//System.out.println("" + a + b + c + d);

			if (a * b == 72 && a + b + c + d == 20) {

				boolean flag = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = false;
					}
					
				}if(flag) {
					System.out.println(i);
				}
			}

		}
	}

}
