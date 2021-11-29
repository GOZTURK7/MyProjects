package RandomExercises;

public class Array_LeadersNums {

	public static void main(String[] args) {
		 /*
        Write a Java program to print all the LEADERS in the array.

		Note: An element is leader if it is greater than all the elements to its right side.
     */
		
		 int arr[] = {10, 9, 14, 23, 15, 0, 9};

		 
		 for (int i = 0; i < arr.length; i++) {
			 
			 boolean flag=true;
			 for (int j = i+1; j < arr.length; j++) {
				
				 if (arr[i] <= arr[j]) {
					 flag=false;
					 continue;	
					 
				 }
			}if(flag==true) {
			 System.out.print(arr[i]+ " ");
			}
			
		}
		 
	}

}
