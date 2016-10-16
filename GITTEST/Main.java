
public class Main {  // klasa punkt mogłaby się znaleźć także w tym pliku, bo jest klasą pakietową.

	public static void main(String[] args) {
		
		Punkt punkt = new Punkt();
		
		//test domyślnych wartości z konstruktora bezparametrowego
		System.out.println("współrzędna x = " + punkt.pobierzX()); 
		System.out.println("współrzędna y = " + punkt.pobierzY());
		
	//	Punkt punkt1 = new Punkt(0,0); // nowy obiekt z parametrami
		
		
//		Punkt pomocniczyPunkt; 

        //tu jest nowa zmiana!
	
		Punkt pomocniczyPunkt = new Punkt(); 
		
		punkt.pobierzWspolrzedne(pomocniczyPunkt);
		
	//	pomocniczyPunkt = punkt.pobierzWspolrzedne();
		
		System.out.println("Przed ustawieniem współrzędnych: ");
//		System.out.println("współrzędna x = " + pomocniczyPunkt.x);
//		System.out.println("współrzędna y = " + pomocniczyPunkt.y);
		
		// punkt.x = 10; // próba odwołania się do prywatnego pola klasy punkt - błąd
		
		System.out.println("współrzędna y = " + pomocniczyPunkt.pobierzX());
		System.out.println("współrzędna y = " + pomocniczyPunkt.pobierzY());
		
		punkt.ustawWspolrzedne(1, 10);
		punkt.pobierzWspolrzedne(pomocniczyPunkt);
		//pomocniczyPunkt = punkt.pobierzWspolrzedne();
		
		System.out.println("Po ustawieniu współrzędnych: ");
		System.out.println("współrzędna x = " + pomocniczyPunkt.pobierzX());
		System.out.println("współrzędna y = " + pomocniczyPunkt.pobierzY());
		
	//	punkt.ustawWspolrzedne(5, punkt.pobierzWspolrzedne().y);
		
	//	System.out.println("współrzędna x = " + punkt.x);
	//	System.out.println("współrzędna y = " + punkt.y);
		
		KolorowyPunkt kolorowyP = new KolorowyPunkt(10, 20, 100);
		
		System.out.println("współrzędna x = " + kolorowyP.pobierzX());
		System.out.println("współrzędna y = " + kolorowyP.pobierzY());
		System.out.println("kolor: " + kolorowyP.pobierzKolor());
		
		
		//==================================================================
		
		KlasaA obiektA = new KlasaA();
		KlasaB obiektB = new KlasaB();
		
		System.out.println("Wywołanie metody f z klasy klasaA: ");
		obiektA.f();
		System.out.println("Wywołanie metody f z klasy klasaB: ");
		obiektB.f();
		
		

	}

}
