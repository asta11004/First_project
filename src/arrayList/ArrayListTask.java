package arrayList;

import java.util.*;

public class ArrayListTask {

	public static void main(String[] args) {
		
		ArrayList <Double> pricelist = new ArrayList <>();
		pricelist.add(22.3);
		pricelist.add(33.1);
		pricelist.add(2.3);
		pricelist.add(64.3);
		pricelist.add(1.3);
		
		for(Double one: pricelist) {
		System.out.println(one);	
			
		}
		System.out.println(pricelist.get(2));
		System.out.println("---------------");
		
		for(int i=0; i<pricelist.size(); i++) {
		if(pricelist.get(i)>10) {	
			System.out.println(pricelist.get(i));
		}
	}
		double sum=0.0;
		for( Double each : pricelist) {
			sum+=each;
		}
		
	System.out.println("-----------------------");	
		
System.out.println("Sum of all numbers = "+ sum);
	}
}
