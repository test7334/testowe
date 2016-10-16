package obslugaWyjatkow2;

public class Tablica {
	
	int tab[];

	
	public Tablica(){
		tab = new int[5];
	}
	/*
	int getElement(int index){
		
		return tab[index];
	}
	*/
	
	//==========================================
	// samodzielne generowanie własnego wyjątku
	
	int getElement(int index){
		
		if(index<0 || index >4){
			
			throw new ArrayIndexOutOfBoundsException("Index poza zakresem. ");		
		}
		return tab[index];
	}
	
	
	
	
	
	
	
}
