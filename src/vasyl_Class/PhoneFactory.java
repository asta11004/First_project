package vasyl_Class;



public class PhoneFactory {
	

		public static void main(String[] args) {
			
		Phone iphone = new Phone();

		// how we are accessing instance fields
		// or instance variables
		// object - it's an instance of class
		// in this case, iphone it's an object of Phone class
		// we are defining values of instance variables
		// only for this particular object
		// only for this particular object
		iphone.brand = "Apple";
		iphone.model = "Iphone XS";
		iphone.OS = "IOS";
		iphone.color = "Rose Gold";
		iphone.storageSize = 256;	
		iphone.screenSize = 5.8;
		iphone.ram = 3;
		iphone.camera = 12;
		iphone.price = 999.99;
		iphone.isWaterResistant = true;
		iphone.supports5G = false;
		iphone.cpu = "Apple Bionic A13";
		iphone.imei = 990000862471854L;
		// no let's check what this iphone has
		System.out.println(iphone.brand);
		// it will display this message:Phone is ringing
		iphone.ring();
		iphone.call();
		iphone.sendSMS("Hello World!", 5718930234L);
		iphone.dial(5718930234L);
		System.out.println("---------*************--------------------");
		
		
		
		Phone samsung = new Phone();
		
		
		
		
		samsung.brand= "samsung";
		samsung.model = "S9";
		samsung.OS = "IOS";
		samsung.color = "Navy Blue";
		samsung.storageSize = 128;
		samsung.isWaterResistance =true;
		samsung.screenSize = 4.8;
		samsung.ram =3;
		samsung.camera =12;
		samsung.price = 799.99;
		samsung.supports5G = false;
		samsung.cpu = "Android";
		samsung.imei = 2653238432L;
		
		samsung.ring();
		samsung.call();
		samsung.dial(54443434344l);
		samsung.sendSMS("Bye", 54443434344l);
		samsung.printInfo();
		
		
		 Phone pixel  = new Phone ();
		 
		    pixel.brand = "Google" ; 
		    pixel.OS = "Google OS";
		    pixel.storageSize = 32;
		    pixel.ring();
		    pixel.dial(425678936L);
		    
		
	}

	// add you own methods to the Phone class
	// I cannot do like this: Phone.ring();
	// It's not valid, because it's not a static method
	// I have to create an object, before accessing these methods
	// and instance fields
	// static methods, variables -> belong to class
	}


