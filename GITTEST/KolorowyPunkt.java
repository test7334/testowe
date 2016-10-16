
public class KolorowyPunkt extends Punkt{  // dziedziczenie - klasa Punkt jest klasą bazową, a ta - potomną
	
	private int kolor;
	
	public KolorowyPunkt(){
		
		super(); // powoduje wywołanie bezargumentowego konstruktora klasy Punkt (klasy nadrzędnej)
		kolor = 0;  // domyślnie ustawia kolor na 0
	}
	public KolorowyPunkt(int wspX, int wspY, int nowyKolor){
		
		super(wspX, wspY); // powoduje wywołanie dwuargumentowego konstruktora klasy Punkt i przekazanie mu wartości wspX i wspY
		kolor = nowyKolor; // ustawia kolor na wartość argumentu odpowiadającego kolorowi (trzeciemu arg.)
		
	}
	public void ustawKolor(int nowyKolor){
		
		kolor = nowyKolor;
		
	}
	public int pobierzKolor(){
		
		return kolor;
	}

}
