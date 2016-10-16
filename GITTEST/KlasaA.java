
class KlasaA { // przesłanianie metod przy dziedziczeniu

	void f(){ // metoda z klasy bazowej jest przesłaniana przez metodę z klasy pochodnej
	
		System.out.println("Metoda f z klasy KlasaA. ");
		
	}
	
}

class KlasaB extends KlasaA{
	
	void f(){ // standardowo będzie dostępna tylko metoda z tej klasy.
		
		//System.out.println("Metoda f z klasy KlasaB. ");
		
		// super.nazwa_metody(argument_metody);
		
		super.f(); // w obiekcie typu KlasaB uzyskanie dostępu do metody pochodzącej z klasy klasaA (bazowej).
		
		
	}
}
