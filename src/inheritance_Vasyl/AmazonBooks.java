package inheritance_Vasyl;

import inheritance_Akbar.Mp3Book;

public class AmazonBooks {

	public static void main(String[] args) {
	
	PaperBook book1 = new PaperBook();	
		
		book1. author ="Mark Twain";
		book1.setTitle("The Adventures of Tom Sawyer");
		book1.chapterCount = 33;
		book1.isHardCover = true;
		book1.price = 19.99;
		book1.pageCount= 274;
		
		System.out.println(book1);
		
		// is book1 is an instance of Book class?
		System.out.println(book1 instanceof Book); 
		//true, because Book is a super class for PaperBook, that's why book1 is an istance of Book too!
		//"instanceof " keyword checks relation
		Mp3Book book0=new Mp3Book();
		
		book0.author="Walter Savitch";
		book0.setTitle("Asta");
		

	    AudioBook audiobook1 = new AudioBook("Leo Tolstoy", 9.99, 120, "War and Peace");
	    System.out.println(audiobook1);
		
	}
	
}
