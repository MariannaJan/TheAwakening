package Awakening;

import java.util.HashMap;

public class CharacterSetupMain {

	public static void main(String[] args) throws Exception {
		
			
			ICharacter player1 = new SkillDecorator(new RaceDecorator(new BasicCharacter()));
			player1.createCharacter();
		
			SavePlayer.savePlayer(player1);
			System.out.println("The player file has been saved");
		
			System.out.println("Do you want to load the saved character?");	
			
			HashMap <String, String> onLoad = new HashMap <String, String>();
			
			onLoad.put("y", "yes");
			onLoad.put("n", "no");
			
			
			String choice = Communication.printChoice(onLoad);
			
			switch (choice){
			
			case "y": LoadPlayer.loadPlayer().playerInfo();
			break;
		
			case "n": System.out.println("Thank you for trying the Awakening");
			break;
	}
			
			
			
			
			
		
	
		
		

	}

}
