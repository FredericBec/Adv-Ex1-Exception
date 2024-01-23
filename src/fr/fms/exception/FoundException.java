package fr.fms.exception;

import java.util.Date;

public class FoundException{

	public static void main(String[] args) throws Exception{
		Date date = null;
		Date today = new Date();
		
		/*
		 * La méthode getClass() provient de la classe mère Object
		 * et affiche les infos de la classe de l'objet
		 */
		/*
		try {
			System.out.println(date.getClass().getName());
			
		}catch(NullPointerException e){
			System.out.println("la date ne peut être " + e.getMessage());
		}
		*/
		try {
			//if(date == null) throw new NullPointerException("la date ne peut être nulle !!");
			if(date == null) throw new DateException();			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(today.getClass().getName());
		

	}

}
