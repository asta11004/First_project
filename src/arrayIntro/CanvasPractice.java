package arrayIntro;

public class CanvasPractice {

	public static void main(String[] args) {
		
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
		
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 	

    for(int i =0; i< 9;i++) {
   
	System.out.println("The course ID for <"+courses[i]+"> is <"+courseId[i]+">");

	}
    
    
    
    
                // find out the ID of online Java Programming course 
    
    for(int i=0; i<courses.length;i++) {
      
      String eachCourse = courses[i] ; 
      //System.out.println(eachCourse);
      if(eachCourse.equals("Online-Java Programming")) {
        System.out.println("INDEX IS " +  courseId[i]  );
        break; 
      }
    }
}
}