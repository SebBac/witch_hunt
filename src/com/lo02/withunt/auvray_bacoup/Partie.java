package com.lo02.withunt.auvray_bacoup;

public class Partie {

    private static Partie partie;
    private Joueur[] listeJoueurs;
    private CarteRumeur[] listeCarteRumeur;
    private Round roundActuel;

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World !");

    }


    private Partie() {
        this.initialiserCarteRumeur();
        this.demanderListeJoueurReel();
        this.demanderNombreJoueurVirtuel();
    }


    private void initialiserCarteRumeur() {
        CarteRumeur[] listeCarteRumeur = new CarteRumeur[12];

        this.listeCarteRumeur = listeCarteRumeur;
    }

    private void demanderListeJoueurReel() {

    }

    private void demanderNombreJoueurVirtuel() {

    }

    public boolean isGameOver() {
        boolean isGameOverBoolean = false;

        return isGameOverBoolean;
    }

    public Joueur[] getListeJoueurs() {
        return this.listeJoueurs;
    }



}
