package halukHoca;

public class StringManupulation {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        
        int a = pickName.indexOf("A");
       	int l = pickName.indexOf("L");
       	int i = pickName.indexOf("I");
        System.out.println(pickName.charAt(a)+ " " + pickName.charAt(l) 
        + " " + (String.valueOf(pickName.charAt(i)).toLowerCase()));       
	}

}
