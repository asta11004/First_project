package officeHour;

import java.util.Arrays;
import java.util.Scanner;

public class VasylArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "Kiwi", "Apple", "Pieapple", "Orange", "Pear" };
        String[] words2 = new String[] { "Apple", "Orange", "Pear" };
        String[] words3 = new String[3];
        words3[0] = "Apple";
        words3[1] = "Orange";
        words3[2] = "Pear";
//      this method sorts in ascending order, or from a to z, in case of strings
//      if we have numbers, it sorts from lowest to highest
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        
        String sentence = "Java is the best coding language";
        sentence = sentence.trim();
//      how to store these words separtly in the array?
        String[] newWords = sentence.split(" ");
        System.out.println(Arrays.toString(newWords));
        // in order to print every word from new line
        for (String s : newWords) {
            System.out.println(s);
        }
        int[] numbers = { 23, 325, 23, 52, 64, 43, 26, 46 };
        int amountOfSpaces = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                amountOfSpaces++;
            }
        }
        System.out.println(amountOfSpaces);
        String[] newWords2 = new String[++amountOfSpaces];
        for(int i =0; i < newWords2.length;i++) {
            if(i<newWords2.length-1) {
                newWords2[i] = sentence.substring(0, sentence.indexOf(" "));
                sentence = sentence.substring(sentence.indexOf(" ")+1);
            }else {
                newWords2[i] = sentence.substring(i);
            }
        }
        System.out.println(Arrays.toString(newWords2));

                     /////////   REVERSE ORDER     /////////


        System.out.println("********");
        System.out.println(Arrays.toString(newWords2));
        for(int i = newWords2.length-1;i>=0;i-- ) {
            System.out.println(newWords2[i]);
        }
	
		   
		
		
		
		
		
		
		
		
		
	}

}
