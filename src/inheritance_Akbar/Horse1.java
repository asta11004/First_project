package inheritance_Akbar;

public class Horse1 extends Animal1{

	 
	  // everytime horse make noise 
	  // it should make animal noise first 
	  // then it should make horse specific noise 
	  
	  @Override
	  public void makeNoise() {
	    
	    //System.out.println("General Noise");
	    System.out.println("Neigh Neigh");
	    super.makeNoise();
	    System.out.println("done neighing");
	    super.makeNoise();
	    System.out.println("now really done neighing");
	    
	    
	  }

	}
