package arrayIntro;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
	    String[] dcComicHeros = {"Superman",
	            "Batman",
	            "Aquaman",
	            "Wonder Woman",
	            "The Flash"
	            ,"Green Lantern",
	            "Vasyl"
	          } ;  
	    
	    String[] herosCopied = new String[ dcComicHeros.length] ; 
	    for (int i = 0; i < herosCopied.length; i++) {
	      herosCopied[i] = dcComicHeros[i] ; 
	    }

	    System.out.println( Arrays.toString( herosCopied) );
	    
//	    // Sort this array 
//	    // use for each loop to loop through all of them 
//	    // if this array has the hero you are looking for 
//	    // print Bingo 
	//    
	    Arrays.sort(herosCopied);
	    System.out.println( Arrays.toString( herosCopied) );
	    System.out.println( Arrays.toString( dcComicHeros) );
	    
	    
	    
	    
	    
	    
	    
	    
/*	    
	    String[] dcComicHeros = {"Superman",
	            "Batman",
	            "Aquaman",
	            "Wonder Woman",
	            "The Flash"
	            ,"Green Lantern"
	          } ;  
	    
	    
	    System.out.println(Arrays.toString(dcComicHeros));
	    
	    String[] copyOf2 =  Arrays.copyOf(dcComicHeros, 2) ; 
	    String[] copyOf6 =  Arrays.copyOf(dcComicHeros, 6) ; 
	    
	    String[] copyOf0 =  Arrays.copyOf(dcComicHeros, 0) ; 
	    String[] copyOf10 = Arrays.copyOf(dcComicHeros, 10) ; 
	    
	    
	    System.out.println(Arrays.toString(copyOf2));
	    System.out.println(Arrays.toString(copyOf6));
	    System.out.println(Arrays.toString(copyOf0));
	    System.out.println(Arrays.toString(copyOf10));
	    
	       
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    for (String hero : dcComicHeros) {
	      //System.out.println(hero);
	      if(hero.equals("Vasyl")) {
	        System.out.println("Bingo");
	      }
	    }
	//    
	    	
		
		
		
		
		
		
		
		
	*/	
		
		
	}

}
