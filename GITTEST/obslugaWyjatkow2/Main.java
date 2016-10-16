package obslugaWyjatkow2;

public class Main { //tutaj przechwycenie wyjątku w klasie main zamiast w klasie tablica

	public static void main(String[] args) {
		
		Tablica tab = new Tablica();
		int value = 0;
		
		try{
			value = tab.getElement(20);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Nie ma elementu o numerze 20!");
			System.exit(-1);
			
		}
		
		System.out.println("Element nr 20 to: " + value);

	}

}
