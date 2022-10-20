/*
  Titre      : plus grande valeur
  Auteur     : Duvalier Tsagmo
  Date       : 20/10/2022
  Description: ce programme doit afficher la plus grande valeur et son index
  Version    : 0.0.1
*/

import java.util.Scanner;
import java.util.Random;
public class PlusGrandeValeur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int max = 100;
        int min = 0;
        int tailleTableau = 15;
        int indexPlusGrand = 0;
        int[] tableau = new int[tailleTableau];
        // remplissons le tableau
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(max - min + 1) + min;
        } 
        // on recherche le plus grand
        indexPlusGrand = maxIndex(tableau);
        // on affiche les informations du tableau
        System.out.print(" **********Afficage du tableau***********\n");
        for (int i = 0; i < tableau.length; i++) {
            System.out.format("tableau[%d] = %d\n", i, tableau[i]);
        }
        
        // on affiche les info du max
        System.out.println("le plus grand nombre du tableau : " + tableau[indexPlusGrand]);
        System.out.println("il est à l'index : " + indexPlusGrand);
    }

    static int maxIndex(int[] tab) {
        int res = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > tab[res]) {
                res = i;
            }
        }
        return res;
    }
}
