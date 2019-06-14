package varArgs;

public class CmdArgument {

	public static void main(String[] args) {

		/*
		 * // Warm up Create a static method called findLongestWord this method have one
		 * parameter as String vararg and return the longest word as String
		 */
		String[] names = { "asta", "mario", "jake", "emily","james"};
		 System.out.println(  findLongestWord("Odiljan","Talmurat","Sulayman","Marat")   );
		 System.out.println(  findLongestWord(names));
//	    
//	    String longestWord = names[0];
//	    
//	    for (String name : names) {
//	      
//	      if(name.length() > longestWord.length()) {
//	        longestWord = name ; 
//	      }
//	      
//	    }

//	    for (int i = 0; i < names.length; i++) {
//	      
//	      if(names[i].length() > longestWord.length() ) {
//	        
//	        longestWord = names[i];
//	        
//	      }
//	      
//	    }

		

	}
	 public static String findLongestWord(String... words) {

		    String longestWord = words[0];

		    for (String name : words) {
		      if (name.length() >= longestWord.length()) {
		        longestWord = name;
		      }
		    }

		    return longestWord;
		  }

}
