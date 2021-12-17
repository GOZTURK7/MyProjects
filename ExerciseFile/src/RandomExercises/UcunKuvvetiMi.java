package RandomExercises;

public class UcunKuvvetiMi {

	public static void main(String[] args) {

		int num = 81;
		int numOrj = 81;

		if (powerOfThree(num) == true) {
			System.out.println(numOrj + " 3'ün Kuvvetidir.");
		} else {
			System.out.println(numOrj + " 3'ün Kuvveti Değildir.");

		}

	}

	private static boolean powerOfThree(int num) {

		if (num % 3 == 0) {
			do {
				num /= 3;
			} while (num > 1);
			return true;

		} else {
			return false;
		}

	}

}
