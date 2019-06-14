package arrayList;

import java.util.ArrayList;

public class MoreArrayListMethods {

	public static void main(String[] args) {
		
		   ArrayList<Integer> numlst = new ArrayList<>(); 
		    
		    numlst.add(100); 
		    numlst.add(200); 
		    numlst.add(300); 
		    numlst.add(400); 
		    
		    System.out.println( numlst );
		    
		    // if you try to access index does not exist 
		    // indexoutofbound exception
		    //System.out.println( numlst.get(7) );
		        
		    // inserting items at certain location 
		    
		    // insert 500 as second item 
		    
		    // when inseting a value , the index shift to the next location 
		    // add (index , value) 
		    numlst.add(1, 500) ; 
		    System.out.println( numlst );
		    
		    // it should be within range or exception occur
		    //numlst.add(10, 500) ; 
		    
		    
		    // Updating a value inside ArrayList item 
		    // set(index, newValue)
		    numlst.set(2, 1000) ; 
		    System.out.println(numlst);
		    
		    // removing items from arrayList 
		    // remove(ItemValue)
		    // remove(index)
		    // THIS WILL WAIT 
		    
		    
		    // deleting everything from the list 
		    numlst.clear();
		    System.out.println(numlst);
		    
		    
		 
		
		
		
		

	}

}
