/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Mega-PC
 */
public class stock {
   
    private String nom;
    private double prix;
    private int quantiteEnStock;
    

    public stock(String nom, double prix, int quantiteEnStock) {
        this.nom = nom;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
    }
    
   
    public void afficherDetails() {
        System.out.println("Nom de l'article : " + nom);
        System.out.println("Prix : " + prix + " euros");
        System.out.println("Quantité en stock : " + quantiteEnStock);
    }
}