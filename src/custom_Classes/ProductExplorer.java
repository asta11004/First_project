package custom_Classes;

public class ProductExplorer {

	public static void main(String[] args) {
		 System.out.println( isTitleWord("or"));
//
//	    Product p1 = new Product(); 
//	    //p1.name = "someyhin"; 
//	    p1.initilizeAllFieldValues("Watch", 4.5f, 113.39,"x123");
//	  
//	    System.out.println(  p1.getName()  );
//	    System.out.println(  p1.getRating()  );
//	    System.out.println(  p1.getPrice()  );
//	    System.out.println(  p1.getProductId()  );
//	    
//	    // 20 $ sale is on going , change the value of price
//	    p1.setPrice(113.39 - 20);
//	    
//	    // Given all product info in one String as below , 
//	    String productInfo = "Bag, 4.9, 399.99, gucci12";
//	    // take above String and turn it into Product Object 
//	    String[] productSplitted = productInfo.split(", "); 
//	    //--{"Bag", "4.9", "399.99", "gucci12"}
//	    //--   0      1       2         3 
//	    
//	    // getting the product name using index 0 
//	    String productName   = productSplitted[0]; 
//	    // getting the product rating using index 1
//	    // however our rating is a float so we need to convert String to float 
//	    // Float.parseFloat(strObject) --> return float 
//	    float productRating  = Float.parseFloat( productSplitted[1] ) ; 
//	    // getting the product price using index 2
//	    // however our price is a double so we need to convert String to double 
//	    // Double.parseDouble(strObject) --> return double 
//	    double productPrice  = Double.parseDouble(productSplitted[2])  ; 
//	    // getting the product id using index 3
//	    String productId = productSplitted[3];
//	    
//	    // creating new Object and call the method we created to set all field values
//	    Product p2 = new Product(); 
//	    p2.initilizeAllFieldValues(productName, productRating, productPrice, productId);
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
	 public static  Boolean isTitleWord(String word) {
			String [] arr= { "a" , "an", "the","and", "but", "for", "nor", "or", "so", "yet","at", "by", "in", "into", "near", "of", "on", "to", "than", "via" };
	    	boolean check=false;
	    	for( int i=0; i<arr.length-1;i++){
	    	  if(arr[i].equals(word)){
	    	    check=true;
	    	  }
	    	}
	    	
	    	
	    	return check;
	        
	    }
}