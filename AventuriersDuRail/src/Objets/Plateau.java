package Objets;
import java.util.Stack;
import java.lang.Double;

public class Plateau {

	Ville[] villes = new Ville[Donnees.VILLES.length];
	Route[] routes;
	
	//Définition du constructeur de la classe
	Plateau(){
		for(int k = 0; k < Donnees.VILLES.length; k++) {
			Ville ville = new Ville(getDonneesVillesNom(k), getDonneesVillesX(k), getDonneesVillesY(k));
			villes[k] = ville;
		}
	}
	
	
	String getDonneesVillesNom(int k) {
		int espace = 0;
		int count = 0;
		String result = new String();
		Stack stockCaractere = new Stack();
		for(int j = Donnees.VILLES[k].length()-1 ; j >=0 ; j--) {
			 
			char s = Donnees.VILLES[k].charAt(j);
				
			if(s == ' ' && espace != 3) {
				espace += 1;
				if(espace == 1 || espace == 2) {
					while(count > 0) {
						stockCaractere.pop();
						count -= 1;
					}
				}
			}
			else {
				stockCaractere.push(s);
				count += 1;				
				}
		}
		while(count > 0) {
			result += stockCaractere.pop();
			count -= 1;
		}
		return result;
	}


	
	double getDonneesVillesX(int k) {
		int espace = 0;
		int count = 0;
		String result = new String();
		Stack stockCaractere = new Stack();
		
		for(int j = Donnees.VILLES[k].length() - 1; espace < 2; j--) {
			char s = Donnees.VILLES[k].charAt(j);
			
			if(s == ' ') {
				espace += 1;
				if(espace == 1) {
					while(count > 0) {
						stockCaractere.pop();
						count -= 1;
					}
				}
				else if(espace == 2) {
					while(count > 0) {
						result += stockCaractere.pop();
						count -= 1;
					}
					return Double.parseDouble(result);
				}
			}
			else {
				stockCaractere.push(s);
				count += 1;				
				}
			}
			return 0;
		}
	
	
	double getDonneesVillesY(int k) {
		int espace = 0;
		int count = 0;
		String result = new String();
		Stack stockCaractere = new Stack(); 
		for(int j = Donnees.VILLES[k].length() - 1; espace < 1; j--) {
			
			char s = Donnees.VILLES[k].charAt(j);
				
			if(s == ' ') {
				espace += 1;
				while(count > 0) {
					result += stockCaractere.pop();
					count -= 1;
				}
				if(espace == 1) {
					return Double.parseDouble(result);
				}
			}
			else {
				stockCaractere.push(s);
				count += 1;				
			}
		}
		return 0;
	}
}



