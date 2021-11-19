package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		
		System.out.print("Inserire nome utente: ");
		String nomeUtente = scanner.nextLine();
		
		
		boolean valido = false;
		int counter = 0;
		
	
		while(!valido && counter < invitati.length) {
			
			if(nomeUtente.equals(invitati[counter])) {
				System.out.println("Ingresso consentito!");
				valido = true;
			} else {
				counter++;
			}
		}
		
		
		if(!valido) {
			System.out.println("Ingresso negato!");
		}
		
		
		/*for(int counter = 0; counter < invitati.length; counter++) {
			
			if(nomeUtente.equals(invitati[counter])) {
				System.out.println("Ingresso consentito!");
				valido = true;
				break;
			}	
		}
		
		
		if(!valido) {
			System.out.println("Ingresso negato!");
		}*/

		
		scanner.close();
	}

}
