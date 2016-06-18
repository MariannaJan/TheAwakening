package Awakening;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SavePlayer {
	
	

	static void savePlayer(ICharacter player1) throws Exception{
	FileOutputStream fos = new FileOutputStream("NewCharacter.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(player1);
	oos.close();}
	
	}
	
	

