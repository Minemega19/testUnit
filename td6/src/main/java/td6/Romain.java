package td6;

public class Romain {
	private String valeur;

	public Romain(String valeur) {
		this.valeur = valeur;
	}

	public String convert(int i) {
		String valeurArabe = "" ;		
		if(i%10 == 0 && i !=0){
			valeurArabe += "X";
			i -= 10;
		}
		if(i%5 == 0 && i !=0){
		valeurArabe += "V";
		i -= 5;
		}

		
		return valeurArabe;
	}
}

	
	
