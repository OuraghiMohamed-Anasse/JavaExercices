import java.util.*;

import java.lang.*;


public class AireTriangle {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("Veuillez entrer la hauteur de votre triangle en cm :");
         float h = scan.nextFloat();

        System.out.println("Veuillez entrer la base de votre triangle en cm :");
         float b = scan.nextFloat();

         float a =  ((b * h)/2);

        System.out.println("L'aire du triangle est de " + a+"cm carré");

    }

}