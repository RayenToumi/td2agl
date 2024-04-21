/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Mega-PC
 */
public class categorie {
  
    private final String nom;
    private final String description;
    private final article[] articles; 
    
    // Constructor
    public categorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.articles = new article[10]; 
    }
    
    /**
     *
     * @param article
     */
    public void ajouterArticle(article article) {
        for (int i = 0; i < articles.length; i++) {
            if (articles[i] == null) {
                articles[i] = article;
                System.out.println("Article ajouté à la catégorie : " + nom);
                return;
            }
        }
        System.out.println("Impossible d'ajouter l'article. La catégorie est pleine.");
    }
    
   
    public void afficherDetails() {
        System.out.println("Nom de la catégorie : " + nom);
        System.out.println("Description : " + description);
        System.out.println("Articles dans la catégorie : ");
        for (article article : articles) {
            if (article != null) {
                System.out.println("- " + article.getNom());
            }
        }
    }
    
   
    public String getNom() {
        return nom;
    }
}
