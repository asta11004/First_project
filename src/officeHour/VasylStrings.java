package officeHour;

public class VasylStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 0;
		String str = "About Java. Go Java Java + "
				+ "Alice Java + Greenfoot "
				+ "Oracle Academy for Educators Get Java";
//		System.out.println(str.indexOf("Java"));
//		System.out.println(str.indexOf("Java") == str.lastIndexOf("Java"));
		for (int i = 0; i < str.length()-3; i++) {
			System.out.println(str.substring(i, i+4));
			if(str.substring(i, i+4).equals("Java")) {
				counter++;
			}
		}
//		System.out.println(str.length());
//		System.out.println(str.substring(6, 10));
//		System.out.println(counter);
//	}
//	
//}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
