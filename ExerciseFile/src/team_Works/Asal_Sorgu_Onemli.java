package team_Works;

public class Asal_Sorgu_Onemli {

	public static void main(String[] args) {

		String container = "";
		String container_son = "";
		int container_asal = 0;

		for (int i = 1000; i < 9999; i++) {

			container = String.valueOf(i);
			String a = container.substring(0, 1);
			String b = container.substring(1, 2);
			String c = container.substring(2, 3);
			String d = container.substring(3, 4);

			int int_a = (Integer.valueOf(a));
			int int_b = (Integer.valueOf(b));
			int int_c = (Integer.valueOf(c));
			int int_d = (Integer.valueOf(d));

			if (int_a * int_b == 72 && int_a + int_b + int_c + int_d == 20) {
				container = ("" + int_a + int_b + int_c + int_d);
				int container_int = Integer.valueOf(container);

				boolean flag = true;

				for (int j = 2; j < container_int; j++) {
					if (container_int % j == 0) {
						flag = false;
					}

				}
				if (flag) {
					container_son = (container_int + " ");
					System.out.println(container_son);

				}
			}
		}
	}

}
