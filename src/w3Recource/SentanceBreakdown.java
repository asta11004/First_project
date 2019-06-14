package w3Recource;

public class SentanceBreakdown {

	public static void main(String[] args) {

		String word = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(word);
	}

	public static void count(String x) {

		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;

		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				number++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}

		}

		System.out.println(x);
		System.out.println("Letters: " + letter);
		System.out.println("Space; " + space);
		System.out.println("Numbers: " + number);
		System.out.println("Other: " + other);
	}
}
