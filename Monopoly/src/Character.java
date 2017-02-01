import java.util.*;
public class Character {

	private String name;
	
	
	public Character(String n)
	{
		name = n;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public static void playerList()
	{
		ArrayList<Character> characterList = new ArrayList<Character>();
		characterList.add(new Character("Top Hat"));
		characterList.add(new Character("Thimble"));
		characterList.add(new Character("Iron"));
		characterList.add(new Character("Shoe"));
		characterList.add(new Character("Battleship"));
		characterList.add(new Character("Canon"));
		characterList.add(new Character("Racecar"));
		characterList.add(new Character("Purse"));
		characterList.add(new Character("Rocking Horse"));
		characterList.add(new Character("Scottish Dog"));
		
	}
}
