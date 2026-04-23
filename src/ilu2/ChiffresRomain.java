package ilu2;

public class ChiffresRomain {
	
	public String toChiffresRomains(int nombre) {
		StringBuilder chiffre = new StringBuilder();
		
		if (nombre <= 3) {
			for (int i = 0; i<nombre; i++) chiffre.append("I");
		}
		
		if (nombre < 1 || nombre > 3999) {
			throw new IllegalArgumentException("valeur incorrecte");
			}
		
		return chiffre.toString();
	}
	

}
