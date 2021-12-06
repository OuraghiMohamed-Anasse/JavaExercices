import java.util.*;

public class ExoJavaAlbahi{
	
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Veuillez entrer la longueur du rectangle :");
		int longe = scan.nextInt();
		
	
		System.out.println("Veuillez entrez la largeur du rectangle :");
		int larg = scan.nextInt();	

		int aire = larg * longe;
		int surface = (2 * larg) + (2 * longe);

		System.out.println("l aire du rectangle est de " +aire+ " la surface elle est de " + surface);	

	}
}

		