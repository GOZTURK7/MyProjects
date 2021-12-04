package recrusive_Methods;

public class Birden10aKadarToplamaDeneme {

	public static void main(String[] args) {

		
		//int result = sum(10);
		System.out.println(sum(10));
		
	}

	private static int sum(int i) {
		if (i > 0) {
			return i + sum(i-1);
		}
		return 0;
	}

}
