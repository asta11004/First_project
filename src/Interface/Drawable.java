package Interface;

public interface Drawable {
	  
	  
	  public static final String DRAWING_TOOL = "PEN"; 
	  
	  // must be implemented in first concrete class 
	  public abstract void draw(); 
	  
	  // can be used as is or being overriden 
	  public default void drawLine(int n) {
	    
	    System.out.println("DRAWING  "+ n + "LINE ");
	    
	  }
	  // only way to use static method of interface is the static way 
	  // it is not inherited 
	  // this behavior is exclusive to interface 
	  // class's static methods are inherited to sub class 
	  
	  public static void printDrawingTool() {
	    System.out.println("MY TOOL IS " + DRAWING_TOOL);
	  }
	  
	  
	  
	  
	}
