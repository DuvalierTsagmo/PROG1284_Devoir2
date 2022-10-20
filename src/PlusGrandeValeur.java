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
        int[] tableau = new int[tailleTableau];
        // remplissons le tableau
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(max - min + 1) + min;
        } 
        System.out.print(" **********Afficage du tableau*********** ");

        System.out.println(maxIndex(tableau));
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
