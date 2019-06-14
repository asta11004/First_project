package inheritance_Vasyl;

public class Book {
	 protected String author;
	  int pageCount;
	  double price;
	  int chapterCount;
	  private String title;
	  
	  public Book(String author, int pageCount, double price, int chapterCount, String title) {
	    super();
	    this.author = author;
	    this.pageCount = pageCount;
	    this.price = price;
	    this.chapterCount = chapterCount;
	    this.title = title;
	    System.out.println("Book constructor with all args!");
	  }

	  public Book() {
	    System.out.println("Book constructor with no args!");
	  }
	  
	  public String getTitle() {
	    return title;
	  }


	  public void setTitle(String title) {
	    this.title = title;
	  }


	  @Override
	  public String toString() {
	    return "Book [author=" + author + ", pageCount=" + pageCount + ", price=" + price + ", chapterCount="
	        + chapterCount + ", title=" + title + "]";
	  }
	  
	  
	  
	}
