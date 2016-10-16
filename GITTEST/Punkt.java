
public class Punkt {
	
	private int x,y;  // pole klasy. private - do takich pól nie można się odwołać z innej klasy. 
	 
	 Punkt(){  // konstruktor bezparametrowy
		 
		 x=320;
		 y=200;   // domyślne wartości każdego nowego obiektu klasy punkt 
	 }
	 Punkt(int wspX, int wspY){ //konstruktor z argumentami - działa tak samo jak metoda ustawWspolrzedne 
		 
		 x = wspX;
		 y = wspY;
		 
	   // ustawWspolrzedne(wspX,wspY);  // wywołanie metody w konstruktorze, zamiast x=wspX ...	 
		 
	 }
	 
	 
	 void ustawWspolrzedne(int wspX, int wspY){ //może być public, ale nie musi być specyfikatora
	 
	 x = wspX;
	 y = wspY;
	 
	 }
	 Punkt pobierzWspolrzedne(){
	 
	/*
	 Punkt punkt = new Punkt();
	 punkt.x = x;
	 punkt.y = y;
	 return punkt;
	  */
	 return new Punkt(x,y);  // dostosowanie do konstruktora dwuargumentowego
	 
	 }
	 void pobierzWspolrzedne(Punkt punkt) { // metoda przeciążona
		 
		 punkt.x = x;
		 punkt.y = y;
		 
	 }
	 void ustawX(int wspX){
		 x = wspX;
	 }
	 void ustawY(int wspY){
		 y = wspY;
	 }
	 
	 int pobierzX(){
		 return x;
	 }
	 int pobierzY(){
		 return y;
	 }
	 
}
