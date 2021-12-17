package replit_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Q2_SwapKelime {

	public static void main(String[] args) {


		/*
		 * Soru2:
			Create a 10-element list. Swap the 8th element with the 3rd element.
			INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
			Output:
			[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		
		 */
		
		String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
		List<String> input = new ArrayList<>();
		
		input.add(names[7]);	
		names[7]=names[2];
		names[2]=input.get(0);
	
		System.out.println(Arrays.toString(names));
		
		
		
		
	}

}
