package repl;

import java.util.Scanner;

public class ReplNew {

	public static void main(String[] args) {
		 
	 		    Scanner input = new Scanner(System.in);
			    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
			    String separator ="";
				for( String word :words){
					
					separator+= word.substring(0,1)+  word.substring(word.length()-1)+", "; 
					
}
				separator = separator.replaceAll(", $", "");	
				System.out.println("["+separator+"]");
}
}