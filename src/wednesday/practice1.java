package wednesday;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education;
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE
		System.out.println("Enter your name");
		name = scan.nextLine();
		name.equalsIgnoreCase(name);
		System.out.println("Do you have a US driver license?");
		String driversLicense = scan.next();

		if (driversLicense.equalsIgnoreCase("no")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println("Enter your zip code");
		int zip = scan.nextInt();
		if (zip == 20910 || zip == 20740) {
			premium += 60;
		} else if (zip == 22102 || zip == 22103) {
			premium += 30;
		} else {
			premium += 50;
		}

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.nextLine();
		scan.next();
		if (vehicleOwnership.equals("Owned")) {
			premium += 10;
		} else {
			premium += 20;
		}
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equals("Business")) {
			premium += 50;
		} else if (vehicleUsage.equals("Pleasure")) {
			premium += 10;
		} else if (vehicleUsage.equals("Commute")) {
			premium += 20;

			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();

			premium = premium + (daysDrivenToWorkOrSchool * 5);
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();

			premium = premium + (milesToWorkOrSchool * 1);
		}

		System.out.println("How old are you?");
		int age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (age >= 16 && age <= 18) {
			premium += premium * 20;
		} else if (age >= 18 && age <= 21) {
			premium += premium * 6;
		} else if (age > 21 && age < 25) {
			premium += premium * 2;
		}
		System.out.println("How many years you've been driving?");
		int yearsDriving = scan.nextInt();
		if (yearsDriving > 0 && (age - yearsDriving) >= 16) {
			premium = premium - (yearsDriving * 5);
		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		System.out.println("Have you had any accidents in the last 5 years?");
		String accidents = scan.next();
		if (accidents.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium + accidentsAmount * (premium * 0.2);
		}

		System.out.println("Have you had continuous insurance for the past 12 months?");

		continuousInsurance = scan.next();
		if (continuousInsurance.equals("No")) {
			premium = (premium + premium);
		}
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();
		scan.next();

		if (education.equals("PhD") || education.equals("Masters") || education.equals("Bachelors")) {
			premium = premium - (premium * 0.05);
		}
		if (education.equals("Doctors")) {
			premium = premium - (premium * 0.10);
		}
		if (education.equals("Less than High School")) {
			premium = premium + (premium * 0.05);
		}
		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);

		String name2 = name.toUpperCase();
		int name1 = name2.length();
		String education1 = education.toUpperCase();
		System.out.println("Reference number: " + name2.substring(0, 2) + age + name2.charAt(name1 - 2)
				+ name2.charAt(name1 - 1) + zip + education);

	}

	}











	double premium = 0;
	int accidentsAmount = 0;
	int daysDrivenToWorkOrSchool = 0;
	int milesToWorkOrSchool = 0;
	String vehicleOwnership = "";
	String vehicleUsage = "";
	String continuousInsurance = "";
	String education = "";
	String name = "";
	String referenceNumber = "";
	Scanner scan = new Scanner(System.in);System.out.println("Welcome to the CountyFarm car insurance!");
//WRITE YOUR CODE HERE

	System.out.println("Enter your name");
	name=scan.nextLine();
	System.out.println("Do you have a US driver license?");
St dLicense =scan.nextLine();
if(dLicense.equalsIgnoreCase("No"))
	{
		System.out.println("Invalid data!");
		System.exit(0);
	}else
	{
	}

	System.out.println("Enter your zip code");
	int zipcode = scan.nextInt();

	if((zipcode==20190)||(zipcode==20740))
	{
		premium += 60;
	}else if((zipcode==22102)||(zipcode==22103))
	{
		premium += 30;
	}else
	{
		premium += 50;
	}

	System.out.println("Is this vehicle Owned, Financed, or Leased?");
	vehicleOwnership=scan.next();
	if(vehicleOwnership.equalsIgnoreCase("Owned"))
	{
		premium += 10;
	}else
	{
		premium += 20;
	}

	System.out.println("How is this vehicle primarily used?");
	vehicleUsage=scan.next();
	if(vehicleUsage.equalsIgnoreCase("Busines"))
	{
		premium += 50;
	}else if(vehicleUsage.equalsIgnoreCase("Pleasure"))
	{
		premium += 10;
	}else if(vehicleUsage.equalsIgnoreCase("Commute"))
	{
		premium += 20;

		System.out.println("Days Driven To Work And/Or School");
		daysDrivenToWorkOrSchool = scan.nextInt();
		premium = daysDrivenToWorkOrSchool * 5;

		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool = scan.nextInt();
		premium = milesToWorkOrSchool * 1;
	}

	System.out.println("How old are you?");
	int age = scan.nextInt();if(age<16)
	{
		System.out.println("Invalid data!");
		System.exit(0);
	}else if(age>=16&&age<18)
	{
		premium *= 20;
	}else if(age>=18&&age<=21)
	{
		premium *= 6;
	}else if(age>21&&age<25)
	{
		premium *= 2;
	}

	System.out.println("How many years you've been driving?");
	int drivingExperience = scan.nextInt();
	if(drivingExperience<=0||(age-drivingExperience<16))
	{
		System.out.println("Invalid data!");
		System.exit(0);
	}else
	{
		premium -= drivingExperience * 5;
	}

	System.out.println("Have you had any accidents in the last 5 years?");
	String accident = scan.next();if(accident.equalsIgnoreCase("Yes")||accident.equalsIgnoreCase("YES"))
	{
		System.out.println("How many?");
		accidentsAmount = scan.nextInt();
		premium += premium * 0.2 * accidentsAmount;
	}

	System.out.println("Have you had continuous insurance for the past 12 months?");
	String insurance = scan.next();if(insurance.equalsIgnoreCase("No"))
	{
		;
		premium = premium * 2;
	}

	System.out.println("What is the highest level of education you have completed?");
	education=scan.next();
	if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters"))
	{
		premium -= premium * 0.05;
	}else if(education.equalsIgnoreCase("Doctors"))
	{
		premium -= premium * 0.1;
	}else if(education.equalsIgnoreCase("Less than High School"))
	{
		premium += premium * 0.05;
	}

	System.out.println(name+", here's your quote!");System.out.println("Start Your Policy Today For: "+premium);

// char first = name.charAt(0);
// char first2 = name.charAt(1);
// char last = (name.charAt(name.length()-1));
// char last2 = (name.charAt(name.length()-2));

	String first2 = name.substring(0, 2);
	String last2 = name.substring(name.length() - 2, name.length());

	referenceNumber=first2+age+last2+zipcode+education;

	System.out.println("Reference number: "+referenceNumber.toUpperCase());

}}









double premium = 0;
int accidentsAmount = 0;
int daysDrivenToWorkOrSchool = 0;
int milesToWorkOrSchool = 0;
String vehicleOwnership = "";
String vehicleUsage = "";
String continuousInsurance = "";
String education = "";
String name = "";
String referenceNumber = "";
Scanner scan = new Scanner(System.in);
System.out.println("Welcome to the CountyFarm car insurance!");
// WRITE YOUR CODE HERE
System.out.println("Enter your name");
name	= scan.nextLine();

System.out.println("Do you have a US driver license?");
String driversLicense = scan.next();
if (driversLicense.equalsIgnoreCase("no")) {
	System.out.println("Invalid data!");
	System.exit(0);
}
System.out.println("Enter your zip code");
int zip = scan.nextInt();
if (zip == 20910 || zip == 20740) {
	premium += 60;
} else if (zip == 22102 || zip == 22103) {
	premium += 30;
} else {
	premium += 50;
}

System.out.println("Is this vehicle Owned, Financed, or Leased?");
vehicleOwnership = scan.next();

if (vehicleOwnership.equals("Owned")) {
	premium += 10;
} else {
	premium += 20;
}
System.out.println("How is this vehicle primarily used?");
vehicleUsage = scan.next();
if (vehicleUsage.equals("Business")) {
	premium += 50;
} else if (vehicleUsage.equals("Pleasure")) {
	premium += 10;
} else if (vehicleUsage.equals("Commute")) {
	premium += 20;

	System.out.println("Days Driven To Work And/Or School");
	daysDrivenToWorkOrSchool = scan.nextInt();

	premium = premium + (daysDrivenToWorkOrSchool * 5);
	System.out.println("Miles Driven To Work And/Or School");
	milesToWorkOrSchool = scan.nextInt();

	premium = premium + (milesToWorkOrSchool * 1);
}

System.out.println("How old are you?");
int age = scan.nextInt();
if (age < 16) {
	System.out.println("Invalid data!");
	System.exit(0);
} else if (age >= 16 && age <= 18) {
	premium = premium * 20;
} else if (age >= 18 && age <= 21) {
	premium = premium * 6;
} else if (age > 21 && age < 25) {
	premium = premium * 2;
}
System.out.println("How many years you've been driving?");
int yearsDriving = scan.nextInt();
if (yearsDriving > 0 && (age - yearsDriving) >= 16) {
	premium = premium - (yearsDriving * 5);
} else {
	System.out.println("Invalid data!");
	System.exit(0);
}

System.out.println("Have you had any accidents in the last 5 years?");
String accidents = scan.next();
if (accidents.equalsIgnoreCase("yes")) {
	System.out.println("How many?");
	accidentsAmount = scan.nextInt();
	premium = premium + accidentsAmount * (premium * 0.2);


System.out.println("Have you had continuous insurance for the past 12 months?");

continuousInsurance = scan.nextLine();
scan.next();
if (continuousInsurance.equalsIgnoreCase("No")) 
	premium = (premium + premium);
}

System.out.println("What is the highest level of education you have completed?");

education = scan.nextLine();


if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Masters") || education.equalsIgnoreCase("Bachelors")) {
	premium = premium - (premium * 0.05);
}   if (education.equalsIgnoreCase("Doctors")) {
	premium = premium - (premium * 0.10);
}  if (education.equalsIgnoreCase("Less than High School")) {
	premium = premium + (premium * 0.05);
}

System.out.println(name + ", here's your quote!");
System.out.println("Start Your Policy Today For: $" + premium);

}
}




