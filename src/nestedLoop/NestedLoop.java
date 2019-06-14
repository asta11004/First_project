package nestedLoop;

public class NestedLoop {

	public static void main(String[] args) {

		// DRY PRINCIPLE
		// DONOT REPEAT YOURSELF
		/*
		 * for (int j = 0; j < 3; j++) {
		 * 
		 * for (int i = 1; i < 6; i++) { System.out.print(i + " "); }
		 * System.out.println();
		 * 
		 * }
		 * 
		 */

//	    for (int i = 1; i < 6; i++) {
//	      System.out.print(i + " ");
//	    }
//	    System.out.println();
//	    for (int i = 1; i < 6; i++) {
//	      System.out.print(i + " ");
//	    }
//	    System.out.println();
//	    for (int i = 1; i < 6; i++) {
//	      System.out.print(i + " ");
//	    }
//	    System.out.println();    
//	  }

//	}
/*
		for (int j = 0; j < 4; j++) {

			for (int i = 15; i >= 5; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
*/
		
//		15 14 13 12 11 10 9 8 7 6 5 
//		15 14 13 12 11 10 9 8 7 6 5 
//		15 14 13 12 11 10 9 8 7 6 5 
//		15 14 13 12 11 10 9 8 7 6 5 
//
//		for (int i = 1; i <= 3; i++) {
//			  System.out.println("Row : " + i);
//			  for (int x = 1; x <= 4; x++) {
//
//			    System.out.print("Column : " + x + " ");
//
//			  }
//			  System.out.println();
//			}   
		
		//   output
//		Row : 1
//		Column : 1 Column : 2 Column : 3 Column : 4 
//		Row : 2
//		Column : 1 Column : 2 Column : 3 Column : 4 
//		Row : 3
//		Column : 1 Column : 2 Column : 3 Column : 4 
//	
//		
//		System.out.print("Cell(" + 1 + "," + 1 + ") "    );
//		System.out.print("Cell(" + 1 + "," + 2 + ") "    );
//		System.out.print("Cell(" + 1 + "," + 3 + ") "    );
//		System.out.print("Cell(" + 1 + "," + 4 + ") "    );
//
//		//    output    Cell(1,1) Cell(1,2) Cell(1,3) Cell(1,4) 
//		
		
		////////////////////////////////////////////////////////////////
		
		 for (int row = 1; row <= 3; row++) {
		      //System.out.println("Row : " + i);
		      for (int col = 1; col <= 4; col++) {

		        System.out.print("Cell(" + row + "," + col + ") "    );

		      }
		      System.out.println();
		    }
		
		
		//////     OUTPUT     ///////////
		 
//		 Cell(1,1) Cell(1,2) Cell(1,3) Cell(1,4) 
//		 Cell(2,1) Cell(2,2) Cell(2,3) Cell(2,4) 
//		 Cell(3,1) Cell(3,2) Cell(3,3) Cell(3,4) 
// 
		
		
	}

}
