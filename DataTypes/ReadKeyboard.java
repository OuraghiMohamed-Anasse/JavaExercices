import java.lang.*;
import java.util.*;

public class ReadKeyboard

{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.println("Entrez vos deux valeurs:");
		a = scan.nextInt();
		b = scan.nextInt ();
		c = a*b;
		System.out.println("Voici votre résultat : "+c);
	}
}