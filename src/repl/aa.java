package repl;

public class TV {


	 int channel=1;
	 int volumeLevel=1;
	 boolean on = false;
	 String brand = "undefined";
	 
  public TV() {
	System.out.println( "Creating TV object using no Args- constructor");
}
  
  public TV(String brand) {
	   this.brand=brand;
	   System.out.println("Creating TV object using 1 arg - constructor");
  }

public int getChannel() {
	return channel;
}

public void setChannel(int channel) {
	this.channel = channel;
	if(channel<1|| channel>120) {
		System.out.println("ERROR: TV is either OFF or invalid Channel");
	}
}

public int getVolumeLevel() {
	return volumeLevel;
}

public void setVolumeLevel(int volumeLevel) {
	this.volumeLevel = volumeLevel;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}
  public void channelUp() {
	   

		      channel++ ;
		    
  

  }
  public void channelDown() {
	   

		      channel-- ;

	   }
  public void volumelUp(int increaseVolume) {
    isOn();
    if(on=true){
      }else if(volumeLevel>=1 && volumeLevel<=7)
    
	   for (int i = volumeLevel; i <= increaseVolume; i++) {

		     volumeLevel++ ;
	   }   
  }

  
  public void volumelDown(int decreaseVolume) {
	   //for (int i = volumeLevel; i <= decreaseVolume; i++) { 

		      volumeLevel-- ;
//}
	   }
  public void turnOn() {
	    
	  
	    
	    if(on == true) {
	     
	      System.out.println("It is already on !!!");
	    }
	    
	  }
	  
	  
	  public void turnOff() {
	    
	    if(on==false) {
	      
	      System.out.println(" TV is already OFF" );
	    }
	    
	  }
	  public void isOn() {
		  this.on=true;
	  }
  }