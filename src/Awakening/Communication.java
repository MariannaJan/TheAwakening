package Awakening;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class Communication 

{
	
	static String printChoice (HashMap <String, String> header)
	{
	
		Set<Entry<String,String>> hashSet=header.entrySet();
		{
			for(Entry<String,String> entry:hashSet ) 
			{

				System.out.println("For "+entry.getValue()+", Press: "+entry.getKey() );
			}	
		}
		while (true)
		{
		System.out.println("Make your choice ");	
		Scanner sc=new Scanner(System.in);
		String choice = sc.next();			
		System.out.println(choice);
		
		
		boolean blnExists = header.containsKey(choice);
	    
		 
		if (blnExists==true)
		{	
			Object value = header.get(choice);
			System.out.println("You have chosen "+ value);
			
			return choice;
		}	
	    System.out.println("Wrong character!");
		}
		
		
		

   	}
	
}
