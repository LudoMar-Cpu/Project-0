/* 
 * Auteur: Ludovic Marvillier
 * Date: 21-08-2025	
 * Sujet: Bonjour le Monde
 * 
 * * * Ce programme affiche "Bonjour le Monde !" et appelle la classe Aurevoir. Et en même temps, la classe Aurevoir appelle la classe Bonjour. Ce qui fait une boucle infinie entre les deux classes.
 * * * Ce programme affiche "Bonjour le Monde !" et appelle la classe Aurevoir. Et en même temps, la classe Aurevoir appelle la classe Bonjour. Ce qui fait une boucle infinie entre les deux classes.
 * * * Ce programme affiche "Bonjour le Monde !" et appelle la classe Aurevoir. Et en même temps, la classe Aurevoir appelle la classe Bonjour. Ce qui fait une boucle infinie entre les deux classes.
 * * * Ce programme affiche "Bonjour le Monde !" et appelle la classe Aurevoir. Et en même temps, la classe Aurevoir appelle la classe Bonjour. Ce qui fait une boucle infinie entre les deux classes.
 */
public class Bonjour {
	private static int a = 10; // Variable d'instance pour la classe Bonjour
	public static void main(String[] args) { // Méthode principale de la classe Bonjour
		System.out.println("Bonjour le Monde !" + "la valeur de a est: " + getA());
		editA(20);
		Aurevoir.main(args); // Appel de la class Aurevoir
	}
	private static void editA(int newA) { /// Méthode pour modifier la valeur de a
		System.out.println("Modification de la valeur de a...");
		a += newA;
		System.out.println("La Nouvelle valeur de a est: " + getA()); // Affichage de la nouvelle valeur de a
		System.out.println("La valeur de a a été modifiée avec succès !");
	}
	public static int getA() { // Méthode pour obtenir la valeur de a
		System.out.println("Obtention de la valeur de a...");
		return a;
	}
}
