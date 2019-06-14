package june_1;


public class SoccerClub {

	int playerCount;
	String name;
	
	Stadium stadium;

	
public SoccerClub(int playerCount, String name, Stadium stadium) {
		
		this.playerCount = playerCount;
		this.name = name;
		this.stadium = stadium;
	}



@Override
public String toString() {
	return "SoccerClub [playerCount=" + playerCount + ", name=" + name + ", stadium=" + stadium + "]";
}


public static void main(String[] args) {
	
	SoccerClub lion=  new SoccerClub(36, "Team", new Stadium(33,"hot dog"));
	
	System.out.println(lion);
}



}
