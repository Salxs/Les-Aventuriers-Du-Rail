package Objets;

public class Ville {
	//On définit les attributs de la classe
	String nom;
	double x;
	double y;
	
	Ville(String nom, double x, double y){
		this.nom = nom;
		this.x = x;
		this.y = y;
	}
	
	//Définition de la méthode renvoyant les attributs de la classe ville dans une chaine de caractère
	String versChaine() {
		String s;
		s= this.nom+' '+'('+ this.x +"," +this.y+')';
		return s;
	}
	
	//Définition du getter pour le nom de la ville
	public String getNom() {
		return nom;
	}
	//Définition du getter pour la coordonnée x
	public double getX() {
		return x;
	}
	//Définition du getter pour la coordonnée y
	public double getY() {
		return y;
	}
}
