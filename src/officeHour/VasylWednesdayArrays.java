package officeHour;

import java.util.Arrays;

public class VasylWednesdayArrays {

	public static void main(String[] args) {
		
		
		
		////////////////   REVERSE THE AARAY  //////////////////
		
		//reverse numbers
		
		
		int[] numbers = { 11, 2, 39, 4, 15 };
		int temp = 0;
		//we have for loop with 2 variables
		//basically, variable i will start from the beginning 
		//variable j will start from the end
		//and, we will take values one by one for swap
		//in the first iteration i will have value of 11
		// and j will have value of 15
		
		for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
			//so temp variable will store value of first element
			temp = numbers[i];
			//we are assigning value of last element to the first element
			numbers[i] = numbers[j];
			//then, we are assigning value of first element (that is inside variable temp)
			//to the last element
			numbers[j] = temp;
			
			// first itteration-->[15, 2, 39, 4, 11]
			// second itteration-->[15, 4, 39, 2, 11]
		}
		System.out.println(Arrays.toString(numbers));
		
               /////////  repl  118/////////////////
		
String email = "myfancy@email.com";
        
        //Write your code below
        if(email.contains("@")) {
            String[] arr = email.split("@");
            if(arr.length==2){
              System.out.println("Email id: "+arr[0]);
              System.out.println("Email domain: "+arr[1]);
            }else{
              System.out.println("invalid email");
            }
        }else {
            System.out.println("invalid email");
        }
		
		
		
		
		
	}

}
