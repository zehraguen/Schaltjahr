import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		
		//der Scanner scant was man eingegeben hat
		Scanner meinScanner = new Scanner(System.in);
		
		//Hauptmenü
		while(true) 
		{
			System.out.println("Hauptmenue");
			System.out.println("----------");
			System.out.println();
			System.out.println("1. Schaltjahrueberpruefer");
			System.out.println("2. Programm beenden");
			System.out.println();
			System.out.println("Bitte waehlen einen Menuepunkt aus!");
			System.out.println();
			
			//die variable welches die eingabe speichert
			int eingabe = meinScanner.nextInt();
			
			System.out.println("Deine Eingabe ist: "+eingabe+". Es wird zum Menuepunkt gewechselt.");
			System.out.println();
			
			//Mittels Verzweigung (if-Abfrage) wird nun in die Menüpunkte gewechselt
			if(eingabe == 1) 
			{
				schaltjahr();
			}
			
			if(eingabe == 2) 
			{
				System.exit(0);
			}
		}
	}
	
	public static void schaltjahr() 
	{
		Scanner meinScanner = new Scanner(System.in);
		System.out.println("Hallo! Ich bin ein Schaltjahrueberpruefer");
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("Bitte gib ein Jahr ein, welches ueberprueft werden soll!");
		System.out.println();

		int eingegebenesJahr = meinScanner.nextInt();

		System.out.println();
		System.out.println("Dein eingegebenes Jahr lautet: "+eingegebenesJahr);

		System.out.println("Dein Jahr lautet: "+eingegebenesJahr+ " und hat bei Division durch 4 den Rest: "+eingegebenesJahr%4);
		
		ueberpruefe(eingegebenesJahr);
	}

	//überprüft ob das Jahr ein Schaltjahr ist
	public static void ueberpruefe(int eingegebenesJahr) { // eigegebenesJahr ist ein Parameter der
		
		if(eingegebenesJahr%4 == 0) 
		{
			if(eingegebenesJahr%100 == 0 && eingegebenesJahr%400 == 0) 
			{
				System.out.println("ist ein Schaltjahr");
				System.out.println();
			} 
			else 
			{
				System.out.println("ist ein Schaltjahr");
				System.out.println();
			}
		} 
		else 
		{
			System.out.println("ist kein Schaltjahr");
			System.out.println();
		}
		
	}
}
