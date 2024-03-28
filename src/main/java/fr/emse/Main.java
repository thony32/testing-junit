package fr.emse;

import fr.emse.test.Money;

public class Main {
    public static void main(String[] args) {
        // Création de deux montants en CHF
        Money m12CHF = new Money(12, "CHF");
        Money m14CHF = new Money(14, "CHF");

        // Ajout des deux montants
        Money result = m12CHF.add(m14CHF);

        // Affichage du résultat de l'addition
        System.out.println("Le résultat de l'addition de " + m12CHF.amount() + " CHF et " +
                m14CHF.amount() + " CHF est " + result.amount() + " CHF.");

        // Afficher un message de bienvenue
        System.out.println("Bienvenue dans l'application de gestion des devises !");
    }
}
