package operacjeWejsciaWyjscia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // wczytywanie danych w pętli, dopóki nie wpisze się quit.

	public static void main(String[] args) {
		
		String line = "";
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Wprowadzaj wiersze tekstu." + "Aby zakończyć, wpisz quit.");
		
		try {
			while (!line.equals("quit")){  // (line != "quit)  => błąd! Porównywane byłyby wtedy referencje, a nie napisy
				
				line = inbr.readLine();
				System.out.println(line);
							
			}
		} catch (IOException e) {
			System.out.println("błąd odczytu!");
		//	e.printStackTrace();
		}
			
		

	}

}
