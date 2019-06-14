package custom_Classes;

public class Vehicle {


	/*
	 * Good Encapsulation practice making instance fields private and providing
	 * public getter / setter for the field for access and modify
	 * 
	 * 
	 * getter --> a method for the value of tour field and the name is specifically
	 * recommended in getFieldName() value of field
	 * 
	 *
	 *
	 * setter --> a method for setting the value of your field and the name
	 * specifically suggested to have setFieldName(dataType fieldName)
	 * 
	 * 
	 * and it will set new value for the field and it does not return value
	 *
	 *
	 *
	 * Create a class called Vehicle with few private fields model , make , speed
	 * create getters and setters for all those private fields
	 * 
	 * create methods : increaseSpeed : it accepts one parameter increaseBy as int
	 * and increase the speed to new speed. if your current speed is 10 and you pass
	 * 5 to this method , outcome should be ---> 10->11->12->13->14->15->
	 * 
	 * decreaseSpeed : it accepts one parameter decreaseBy as int and decrease the
	 * speed to new speed. if your current speed is 10 and you pass 5 to this method
	 * , outcome should be ---> 10->9->8->7->6->5->
	 *
	 *
	 * 
	 * 
	 */

	  private String make;
	  private int speed;
	  private String model;

	  public void increaseSpeed(int increaseBy) {

	    // speed = speed + increaseBy;
	    for (int i = 1; i <= increaseBy; i++) {

	      speed++ ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }
	  
	  public void decreaseSpeed(int decreaseBy) {
	    
	    for (int i = 1; i <= decreaseBy; i++) {

	      speed-- ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
	
