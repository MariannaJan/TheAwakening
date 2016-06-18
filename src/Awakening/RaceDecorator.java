package Awakening;

import java.util.HashMap;

public class RaceDecorator extends CharacterDecorator{
	
	
	private static final long serialVersionUID = 1L;

	public RaceDecorator (ICharacter player){
		
		super (player);
		
	}
	String race;	
		
	public void createCharacter() {
		
		super.createCharacter();
		header.put("h","Human. No special racial abilities");
		header.put("e", "Elf. Racial abilities:night vision, super agility");
		header.put("d", "Dwarf. Racial abilities: night vision, super endurance!");
		header.put ("i", "Imp. Racial abilities: flying, vulnerability to damage!");
		
		setRace();
		
	}
	
	
HashMap <String, String> header = new HashMap <String, String>();

	
public String setRace(){	
		

race = Communication.printChoice (header);


return race;
}


@Override
public void playerInfo() {
	player.playerInfo();
	System.out.println("Your chosen race is " + header.get(race));
	
}



}


