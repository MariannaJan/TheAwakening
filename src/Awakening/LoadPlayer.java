package Awakening;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class LoadPlayer {

	
	static ICharacter loadPlayer() throws Exception
	{
		
	
	FileInputStream fis = new FileInputStream("NewCharacter.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	ICharacter result = (ICharacter) ois.readObject();
	ois.close();
	return result;
	
	
	}
}
