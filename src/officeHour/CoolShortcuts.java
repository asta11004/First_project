package officeHour;

public class CoolShortcuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Certif34534ied Wo345oden 42354Spoon34534java";
        System.out.println(str.replaceAll("\\w", "*"));
        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("^Cert", "*"));
        System.out.println(str.replaceAll("java$", "*"));
	}

}
