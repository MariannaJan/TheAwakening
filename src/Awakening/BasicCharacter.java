package Awakening;

import java.util.Scanner;
import java.io.Serializable;

public class BasicCharacter implements ICharacter, Serializable {

	private static final long serialVersionUID = 1L;
	
	String name;
	
	@Override
	public void createCharacter() {
		
		//HashMap <String, String> playerData = new HashMap <String, String>();
		
		
		System.out.println("Choose your name!");
		Scanner sc=new Scanner(System.in);
		name = sc.next();
		
		System.out.println("Your new name is: "+ name);
		
	
		
	}

	@Override
	public void playerInfo() {
		System.out.println("Your character is:\n"+name);
		
		
	}

	
		
	}


