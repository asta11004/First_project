package arrayIntro;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] movies = {"a","Twilight","Wreck it Ralph", "Superman", "Tangled"} ;
		
		System.out.println(Arrays.toString(movies));
		
		
		System.out.println( movies.length      );// how many items in the string
		
		System.out.println(movies[0].length());// how many letters in [0] word
		
		for (int i =0;i < movies.length; i++) {
			
			System.out.println(movies[i]+ " char count is "+movies[i].length());
		}
//			Twilight char count is 8
//			Wreck it Ralph char count is 14
//			Superman char count is 8
//			Tangled char count is 7		
			
		/////////////////  GET  MAX NUMBER  ///////////////////////////	
		
		int max = movies[0].length();
		
		for(int i =0; i< movies.length; i++) {
			
			if(movies[i].length()  > max) {
				
				max= movies[i].length();   
			}
			
		}
		System.out.println(max);//14
		
		
		////////////////// GET LONGEST NAME, NOT NUMBER///////////////////////////////////
		 max = movies[0].length();
	    // get the location of the word with max length
	    // then just use that index to get the word
	    int index = 0;
	    /* max = 4
	     * Iteration 1 : 7 > 4 ---> max = 7  index = 1  
	     * Iteration 2 : 7 > 7 ---> max = staySame  index = 1  
	     * Iteration 3 : 11 > 7 ---> max = 11  index = 3  
	     * 
	     * */
	    
	    for (int i = 1; i < movies.length; i++) {

	      if (movies[i].length() > max) {
	        max = movies[i].length();
	        index = i;
	      }

	    }

	    System.out.print(index+" is of the word location "
	        + "that has the max length: "+ movies[index]); 

	}			
		
}		
		
		
		
		
			
			
		
	


