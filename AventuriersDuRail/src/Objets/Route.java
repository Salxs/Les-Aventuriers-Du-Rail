package Objets;

public class Route {
	//on définit les attributs de classe
	String nom;
	String couleur;
	Ville villeDepart;
	Ville villeArrive;
	
	//constructeur de la classe Route
	Route(String couleur, Ville villeDepart, Ville villeArrive){
		this.couleur = couleur;
		this.villeDepart = villeDepart;
		this.villeArrive = villeArrive;
	}
	
	//Définition du getter ou acceseur en mode lecture de la couleur de la ville
	public String getCouleur() {
		return couleur;
	}
	//Définition du getter qui renvoie la ville de départ
	public Ville getVilleDepart() {
		return villeDepart;
	}
	//Définition du getter qui renvoie la ville d'arrivée
	public Ville getVilleArrive() {
		return villeArrive;
	}
	
	//Définition d'une méthode renvoyant le nombre de case de la route
	int getLongueur() {
		int nbreCase;
		double xDistanceEuclidienne = Math.pow(villeDepart.x - villeArrive.x, 2); //On réalise la différence au carré des coordonnées x
		double yDistanceEuclidienne = Math.pow(villeDepart.y - villeArrive.y, 2); //On réalise la différence au carré des coordonnées y
		nbreCase = (int)(Math.sqrt(xDistanceEuclidienne + yDistanceEuclidienne)) / 33; // On réalise la distance euclidienne
		return nbreCase;
	}
	//Définition méthode attribuant le nombre de point en fonction de la longueur de la route
	int getNombrePoint(int nbreCase) {
		if(nbreCase == 1) {
			return 1;
		}
		else if (nbreCase == 2) {
			return 2;
		}
		else if (nbreCase == 3) {
			return 4;
		}
		else if(nbreCase == 4) {
			return 7;
		}
		else if(nbreCase == 5) {
			return 10;
		}
		else if(nbreCase == 6) {
			return 15;
		}
		else {
			return 0;
		}
	}
	
	//Définition de la méthode permettant de renvoyer les attributs de la route sous la forme d'une chaine de caractère
	String versChaine(int nbreCase) {
		String infoRoute;
		infoRoute = this.villeDepart.nom+" "+"-"+" "+this.villeArrive.nom+"/"+(this.couleur+' ')+ "-"+(nbreCase+' ');
		return infoRoute;
	}

}
