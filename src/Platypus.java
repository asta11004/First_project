import java.util.*;

class Main {
  public static String search(ArrayList<String> r, String find) 
  {
	  String x="";
    for( String i: r){
      if(i.contains(find)){
        x+=i;
      }else{
        x= "search failed";
      }
    }
	return x;
   
   
  }//end wineSeller
  
  public static void main(String[] args)
  {
    
    ArrayList<String>  arr = new ArrayList<String>();
    arr.add("2");
    arr.add("6");
    arr.add("foo bar");
    arr.add("abc");
    
  
    String find_tst = search(arr,"foo");
    System.out.print(find_tst);//foo bar
   
    
  }//end main
}