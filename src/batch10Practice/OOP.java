package batch10Practice;
import java.util.*;

public class OOP {
  public static void main(String[] args) {
	  double weight = 0;
	    double cal = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter weight in pounds:");
	     double weigth = scan.nextDouble();
	    int cal2=(int)cal;
	   cal2= (int) (0.0175*(10*30+8*30+1*360)*weight);
	    
	    
	    System.out.println("Calories Burned: "+cal2);
	   
	    
	    
	  }
	}