/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

public class Produit {
   
   private int identifiant;
   private String libelle;
   private String marque;
   private float prix;
   private Date date_expiration;
  
   // les getters et les setters et les commentaires
   public int getIdentifiant(){
       return identifiant;
   }
   
   public void setIdentifiant(int identifiant){
       this.identifiant=identifiant;
   }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix>0)
        this.prix = prix;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }

    public Produit(){}
  
    
    public Produit(int identifiant,String libelle,String marque){
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
    }
    public Produit(int identifiant,String libelle,String marque,float prix){
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
         if(prix>0)
        this.prix=prix;
    }
     public Produit(int identifiant,String libelle,String marque,float prix, Date date_expiration ){
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
        if(prix>0)
        this.prix=prix;
        this.date_expiration=date_expiration;
    }

    // methode afficher
    public void afficher(){
        System.out.println("Id ="+identifiant+" , libelle = "+libelle+" , marque = "+marque
        +" , prix = "+prix);
    }
    //methode toString
    @Override
    public String toString(){
        return "Id ="+identifiant+" , libelle = "+libelle+" , marque = "+marque
        +" , prix = "+prix+ " , la date est = "+date_expiration;
    }
    /*
    public boolean comparer(Produit p){
       return (identifiant==p.identifiant && libelle.equals(p.libelle) && prix==p.prix);
       
    }
     public static boolean comparer(Produit p1,Produit p2){
         
       return (p1.identifiant==p2.identifiant && p1.libelle.equals(p2.libelle) && p1.prix==p2.prix);
       
    }
     */

}
