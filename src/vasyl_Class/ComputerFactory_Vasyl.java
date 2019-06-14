package vasyl_Class;



public class ComputerFactory_Vasyl {

	public static void main(String[] args) {
		
Computer_Vasyl iMac = new Computer_Vasyl();
//java runs the code it is looking for main method and it is necassary for running code
	
Computer_Vasyl MacBookPro = new Computer_Vasyl();


Computer_Vasyl dell = new Computer_Vasyl();


//they are not equals because they are 2 different objects
		System.out.println(iMac == MacBookPro);
		System.out.println("-------IMAC------");
		iMac.color = "Silver";
		System.out.println(iMac.type);
		iMac.type ="IMAC 27'";
		System.out.println(iMac.type);
		//null is default value for String 
		System.out.println(iMac.OS);
		//0.0 is a default value for floats
		System.out.println(iMac.screenSize);
		iMac.OS = "macOS Mojave";
		iMac.isPersonal = true;
		iMac.screenSize = 21;
		iMac.ram = 16;
		System.out.println("********");
		System.out.println(iMac.OS);
		System.out.println("********");
		iMac.printInfo();
		System.out.println("********");
		dell.printInfo();
		dell.color = "Black";
		dell.isPersonal = false;
		dell.OS = "Windows 10";
		dell.ram = 32;
		dell.type = "Dell XPS";
		dell.screenSize = 15;
		System.out.println("********");
		//we will print values again after setting all values 
		dell.printInfo();
	}
}	