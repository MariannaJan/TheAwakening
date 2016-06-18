package Awakening;

import java.util.HashMap;
import java.util.Scanner;

public class SkillDecorator extends CharacterDecorator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SkillDecorator (ICharacter player){
		
		super (player);
		
		
	}
	String profession;
	
	String professionA;
	String professionB;
	String skill1;
	String skill2;
		
	public void createCharacter() {
		
		super.createCharacter();
		setProfession();
		
	}
	
	public String setProfession(){
		
		int i =2 ;
				
		HashMap <String, String> header = new HashMap <String, String>();
		
		header.put("w","Warrior");
		header.put("m", "Mage");
		header.put("a", "Assasin");
		header.put("b", "Blacksmith");
		header.put ("r", "Ranger");
		
		
		HashMap <String, String> warrior = new HashMap <String, String>();
		
		warrior.put("g", "grapple");
		warrior.put("w", "sword");
		warrior.put("a", "axe");
		warrior.put("p", "spear");
		
		HashMap <String, String> mage = new HashMap <String, String>();
		
		mage.put("s", "spells");
		mage.put("e", "elixirs");
		
		HashMap <String, String> assasin = new HashMap <String, String>();	
		
		assasin.put("t", "stealth");
		assasin.put("p", "poison");
		assasin.put("g", "grapple");
		
		HashMap <String, String> blacksmith = new HashMap <String, String>();
		
		blacksmith.put("r", "repaire equipment");
		
		HashMap <String, String> ranger = new HashMap <String, String>();
		
		ranger.put("t", "stealth");
		ranger.put("r", "archery");
		
		//choice of profession
		
		do{
		System.out.println("Choose your profession");	
		profession = Communication.printChoice (header);
		if (i==2) professionA =header.get(profession);
		if (i==1) professionB =header.get(profession);
		i=i-1;
		header.remove(profession);
		
				
		//choice of profession skill
		
		switch (profession){
			
		case "w": 
		
		
		if (i==1)skill1=warrior.get(Communication.printChoice (warrior));
		if (skill1=="grapple"){assasin.remove("g");}
		if (i==0)skill2=warrior.get(Communication.printChoice (warrior));
		
		break;
		
		case "m":
			
		if (i==1) skill1=mage.get(Communication.printChoice (mage));
		if (i==0) skill2=mage.get(Communication.printChoice (mage));
		break;
		
		case "a":
		if (i==1)skill1=assasin.get(Communication.printChoice (assasin));
		if (skill1=="grapple")warrior.remove("g");
		if (skill1=="stealth")ranger.remove("t");
		if(i==0) skill2=assasin.get(Communication.printChoice (assasin));
		break;
		
		case "b":
		
		if(i==1) skill1=blacksmith.get(Communication.printChoice (blacksmith));
		if(i==0) skill2=blacksmith.get(Communication.printChoice (blacksmith));
		break;
		
		case "r":
		
		if (i==1) skill1=ranger.get(Communication.printChoice (ranger));
		if (skill1=="stealth")assasin.remove("t");	
		if (i==0) skill2 = ranger.get(Communication.printChoice (ranger));
		}
		
		
		int a=1;
		
		if (i==0) a=0;
		while (a!=0){
		System.out.println("Do you want to choose another profession? Press y for yes and n for no");	
		Scanner sc=new Scanner(System.in);
		String choice = sc.next();
		switch(choice){ 
		
		case "y":
			
			a=0;
			break;
			
		case "n": 
			System.out.println("Ok, you don't have to choose another profession");
			i=0;
			a=0;
			break;
		default: System.out.println("Choose the right answer! y for yes, n for no");
		break;
		
		}
		}
		} while (i>0);
		return profession;
		
	}

	@Override
	public void playerInfo() {
		player.playerInfo();
		System.out.println("Your profession is: "+professionA+"  skill: "+skill1);
		if (professionB!=null)System.out.println("Your second profession is: "+professionB + " skill: "+skill2);
	} 
	
}
