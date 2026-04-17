package ilu2;

public class ChiffresRomain {
	
	public String toChiffresRomains(int nombre) {
		StringBuilder chiffre = new StringBuilder();
		
		if (nombre <= 3) {
			for (int i = 0; i<nombre; i++) chiffre.append("I");
		}
		
		return chiffre.toString();
	}
	

}
