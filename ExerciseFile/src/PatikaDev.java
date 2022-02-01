import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatikaDev {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5 };

		Object[] b = { 6, 7, 8, 9, 0 };

		List<Object[]> liste = new ArrayList<>();
		
		
		liste.add(b);

		liste.add(a);
		liste.add(b);

		System.out.println("1. SYSO: " + Arrays.toString(a));

		System.out.println("2. SYSO: " + Arrays.toString(b));

		System.out.println("3. SYSO: " + liste);

		for (Object[] each : liste) {
			System.out.println("4. SYSO: " + Arrays.toString(each));

		}

	}

}
