package inheritance_Vasyl;

final public class AudioBook extends Book {
	  double length;
	  double size;
	  
	  public AudioBook(String author, double price, int chapterCount, String title) {
	    super(author, 0, price, chapterCount, title);
	    System.out.println("Hello from audiobook constructor!");
	  }

	  

	}
