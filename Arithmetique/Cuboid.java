import java.lang.*;
import java.util.*;

public class Cuboid

{
	public static void main(String args[])

		{
	
			Scanner scn = new Scanner(System.in);

			System.out.println("Entrez la longueur en cm");
			int longeur = scn.nextInt();

		
			System.out.println("Entrez la largeur en cm");
			int largeur = scn.nextInt();


			System.out.println("Entrez l'arete  en cm");
			int cote = scn.nextInt();

		
			int aireFace = longeur * largeur;
			int aireCote = cote*largeur;
			int aireBase =cote * longeur;


			int totalArea = (2*aireFace) + (2*aireCote) + (2*aireBase);
			System.out.println("L aire total de votre parallélépipède est de " + totalArea);

			int volume = longeur * largeur * cote ;
			System.out.println("Le volume de votre parallélépipède est de "+volume);

		}
}
		

