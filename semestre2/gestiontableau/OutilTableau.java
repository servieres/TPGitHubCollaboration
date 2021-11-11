/*
 * Classe avec des méthodes outil sur les tableaux 
 * OutilTableau.java                                        11/21
 */

package semestre2.gestiontableau;

/**
 * Classe contenant des méthodes outils pour gérer les tableaux
 * @author C. Servières
 * @version 1.0
 */
public class OutilTableau {
    
    /**
     * Affiche le tableau argument sur la console
     * @param table    tableau à afficher, il contient des entiers
     */
    public static void afficher(int [] table) {
        if (table == null) {
            System.out.print("Référence nulle");
        } else {
            for (int i = 0; i < table.length; i++) {
                System.out.printf("%5d", table[i]);
            }
        }
    }


    /**
     * Recherche le minimum et le maximum d'un tableau d'entiers
     * @param table    tableau contenant les valeurs (des entiers)
     * @return  resultat un tableau de 2 entiers : le premier élément 
     *          contient le minimum du tableau, le deuxième le maximum
     */
    public static int[] miniMaxi(int [] table) {        
        int [] resultat = new int[2];    // résultat renvoyé

        // on suppose que le minimum et le maximum sont à l'indice 0
        resultat[0] = table[0];
        resultat[1] = table[0];

       
        /*
         * on parcourt le tableau  et on met à jour le minimum et 
         * le maximum, avec la case d'indice i, si besoin
         */
        for (int i = 1; i < table.length; i++) {
            if (table[i] < resultat[0]) {
                resultat[0] = table[i];
            } else if (table[i] > resultat[1]) {
                resultat[1] = table[i];
            }
        }

        return resultat;
    }


    /**
     * Effectue un décalage circulaire des éléments du tableau argument
     * vers la droite
     * @param table   tableau à décaler
     */
    public static void decalerDroite(int [] table) {
         // TODO
    }


    /**
     * Détermine le nombre d'occurrences de la valeur argument dans le tableau
     * d'entiers argument
     * @param table   tableau à traiter
     * @param valeur  entier dont on compte les apparitions    
     * @return un entier égal au nombre d'apparitions de la valeur dans le
     *         tableau
     */
    public static int compterOccurrence(int[] table, int valeur) {
        int compteur = 0 ;  // nombre d'apparitions de la valeur
        // TODO
        return compteur ;    // on renvoie le résultat
    }

    
 
    
    /**
     * Effectue un décalage circulaire des éléments du tableau vers la droite
     * mais seulement dans une portion du tableau, délimitée par 2 indices
     * Si debut n'est pas inférieur strictement à fin, la méthode est sans
     * effet. De même si l'un des indices n'est pas valide
     * @param table  tableau à décaler entre les indices debut et fin
     * @param debut  indice de début de la portion de tableau à décaler
     * @param fin    indice de fin de la portion de tableau à décaler
     */
    public static void decalerDroite(int [] table, int debut, int fin) {
        
        // TODO
    }

    
   
    
    /**
     * Effectue une extraction d'un tableau.
     * Renvoie comme résultat un tableau contenant les valeurs du tableau
     * argument situées entre les indices début et fin
     * Si les indices ne sont pas valides, la valeur null est renvoyée
     * (pour être valides les indices doivent être ordonnés)
     * @param table  tableau source de l'extraction
     * @param debut    indice de début de l'extraction
     * @param fin      indice de fin de l'extraction
     * @return le tableau résultat de l'extraction 
     *         (éventuellement égal à null)
     */
     public static int[] extraire(int[] table, int debut, int fin) {
        int [] resultat = null;  // tableau résultat
        // TODO
        return resultat;
     }
     
     
    /**
     * Détermine si une valeur apparaît dans un tableau entre les indices
     * début et fin compris
     * Si les indices ne sont pas valides, la méthode renverra faux
     * @param table   tableau dans lequel la recherche s'effectue
     * @param debut     indice de début de la recherche
     * @param fin       indice de fin de la recherche
     * @return un  booléen égal à vrai ssi la valeur a été trouvée entre
     *         les 2 indices
     */
    public static boolean apparaitDansEntre(int valeur ,
                                        int[] table, int debut, int fin) {
        boolean trouve = false ;
        // TODO
        return trouve;
    }


    /**
     * Détermine le nombre d'occurrences de la valeur argument dans le tableau
     * d'entiers argument, entre les indices début et fin compris
     * Si les indices ne sont pas valides, la méthode renverra 0
     * @param valeur    valeur pour laquelle on compte les apparitions
     * @param table   tableau à traiter
     * @return un entier égal au nombre d'apparitions de la valeur dans le
     *         tableau
     */
    public static int compterOccurrenceEntre(int valeur, int [] table, int debut,
                                        int fin) {
        int compteur = 0;     // nombre d'apparitions de la valeur
        // TODO
        return compteur;   
    }



}
