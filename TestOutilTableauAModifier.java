/*
 * Classe de test des méthodes de la classe OutilTableau
 * TestOutilTableau.java                                        11/21
 */

package semestre2.git.gestiontableau;


/**
 * Classe qui contient les méthodes de test des méthodes de la classe
 * OutilTableau
 * @author C. Servières
 * @version 1.0
 */
public class TestOutilTableauAModifier {

  
    /** Tableau de test numéro 1 */
    private static final int[] TABLE1 = { 12, 34, 5, -8, 4, 6, 9, 12, 5, 11};
    
    /** Tableau de test numéro 2 */
    private static final int[] TABLE2 = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
    
    
    /** Tableau de test numéro 3 */
    private static final int[] TABLE3 = { 5, 10, 10, 20, 25, 10, 5, 10, 45, 10};
        
    /** Tableau résultat du décalage de TABLE1  */
    private static final int[] DECAL_TABLE1 = { 11, 12, 34, 5, -8, 4, 6, 9, 12, 5};
    
    /** Tableau résultat du décalage de TABLE2 */
    private static final int[] DECAL_TABLE2 = { 50, 5, 10, 15, 20, 25, 30, 35, 40, 45};
    
    
    /**
     * méthode de test de la méthode afficher
     */
    public static void testAfficher() {
        System.out.println("TEST de la méthode afficher\n"
                           + "----------------------------\n");
        System.out.println("Le tableau affiché contient les entiers de 5 à 50"
                           + ", de 5 en 5 :");
        OutilTableau.afficher(TABLE2);
        System.out.println();        
    }
    
    
    /**
     * méthode de test de la méthode miniMaxi
     */
    public static void testMiniMaxi() {
        System.out.println("TEST de la méthode miniMaxi\n"
                + "----------------------------\n");
        // TODO    
    }
    
    
    /**
     * méthode de test de la méthode decalerDroite
     */
    public static void testDecalerDroite() {
        System.out.println("TEST de la méthode decalageDroite\n"
                + "----------------------------------\n");
        int[] table1 = { 12, 34, 5, -8, 4, 6, 9, 12, 5, 11};
        // TODO   
    }
    
    
    
    /**
     * méthode de test de la méthode compterOccurrence
     */
    public static void testcompterOccurrence() {
        System.out.println("TEST de la méthode compterOccurrence\n"
                + "------------------------------------\n");
        // TODO   
    }
    
    
    /**
     * méthode de test de la méthode decalerDroite sur un intervalle
     */
    public static void testDecalerDroiteIntervalle() {
        System.out.println("TEST de la méthode decalerDroite (intervalle)\n"
                + "---------------------------------------------\n");
        int[] table1 = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};;
        // TODO   
    }
    
    
    /**
     * méthode de test de la méthode extraire
     */
    public static void testExtraire() {
        int[] resultat;
        System.out.println("TEST de la méthode extraire\n"
                + "-----------------------------------\n");
        int[] table1 = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};;
        // TODO   
    }
    
    
    /**
     * méthode de test de la méthode apparaitDansEntre
     */
    public static void testApparaitDansEntre() {
        System.out.println("TEST de la méthode apparaitDansEntre\n"
                + "-----------------------------------\n");        
        // TODO   
    }
    
    
    
    /**
     * méthode de test de la méthode compterOccurrenceEntre
     */
    public static void testCompterOccurrenceEntre() {
        System.out.println("TEST de la méthode compterOccurrenceEntre\n"
                + "-----------------------------------\n");        
        // TODO   
    }
    
 
     
     /**
      * Programme principal qui lance la méthode de test
      * @param args non utilisé
      */
     public static void main(String[] args) {
         testAfficher();
         // testMiniMaxi();
         // testDecalerDroite();
         // testcompterOccurrence();
         // testDecalerDroiteIntervalle();
         // testExtraire();
         // testApparaitDansEntre();
         // testCompterOccurrenceEntre();        
     }     
}
