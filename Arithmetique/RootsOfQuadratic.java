import java.lang.*;
import java.util.*;

class RootsOfQuadratic

{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int a , b , c ;
		System.out.println("Nous avons un polynôme de degré 2 de la forme ax*x + bx + c");
		System.out.println("Veuillez entrer la valeur de a :");
		a = scan.nextInt();

		System.out.println("Veuillez entrer la valeur de b :");
		b = scan.nextInt();

		System.out.println("Veuillez entrer la valeur de c :");
		c = scan.nextInt();

		double y,t;
		
		y = (Math.sqrt((b*b)-(4f*a*c))-b)/(2f*a); 
		t = (-Math.sqrt((b*b)-(4f*a*c))-b)/(2f*a); 
		System.out.println(y);
		System.out.println(t);
		

	}
}

		