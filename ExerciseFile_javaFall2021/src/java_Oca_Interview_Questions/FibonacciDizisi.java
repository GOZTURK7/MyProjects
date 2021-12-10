package java_Oca_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciDizisi {

	public static void main(String[] args) {

		// 1-2-3-5-8-13
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen bir sayı giriniz:");
//		int num = scan.nextInt();
//		
//		List<Integer> fibonacci = new ArrayList<>();
//		fibonacci.add(0);
//		fibonacci.add(1);
//		
//		for (int i = 0; i < num; i++) {
//				
//			int a=	fibonacci.get(i) + fibonacci.get(i+1);
//			
//			fibonacci.add(i+2, a);		
//			
//		}
//		fibonacci.remove(0);
//		fibonacci.remove(1);
//		System.out.println("Fibonacci: "+fibonacci);
		
		
		
		int [] n = {-1, 2, -4, 20, -1, 2, -4, -4, 2, -1};
		
		singleNumber(n);
	}

	public static void singleNumber(int[] n) {
			
			
			
			
			
			int [] index = new int[n.length];
			
			boolean flag = false;
			for(int i=0; i< n.length; i++){
				
				for(int j=0; j<n.length; j++){
					
					if(i==j){
						
						continue;
					}else if(n[i]==n[j]){
						flag=true;
						break;
						
					}
					
					
			}if(flag==false) {
				index[i]=n[i];
			}
		
		
			}System.out.println(Arrays.toString(index));
	}
		
		
	

}
