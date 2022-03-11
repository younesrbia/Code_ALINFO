/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

public class Magasin {
// Creé par ************** Khaled Jalleli ************** 
    private int identifiant;
    private String nom;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] prods = new Produit[CAPACITE];
    public int cmp = 0;
    public static int cmptotal = 0;
    public Employe[] emps = new Employe[20];
    public int cmp_em;

    public Magasin() {

    }

    public Magasin(int identifiant, String nom, String adresse) {

        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void ajouterEmploye(Employe e) {
        if (cmp_em < 20) {
            emps[cmp_em] = e;
            cmp_em++;
        }
    }

    public void ajouterProduit(Produit p) {
        if (cmp < CAPACITE && !chercherProduit(p)) {
            prods[cmp] = p;
            cmp++;
            cmptotal++;
        }
    }

    public int indexOfProduit(Produit p) {
        for (int i = 0; i < cmp; i++) {
            if (prods[i].comparer(p)) {
                return i;
            }
        }
        return -1;
    }

    public void supprimerProduit(Produit p) {
        int pos = indexOfProduit(p);
        if (pos != -1) {
            prods[pos] = prods[cmp - 1];
            cmp--;
        }
    }

    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < cmp; i++)
        {
            if (Produit.comparer(prods[i], p)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < cmp; i++) {
            s += prods[i].getLibelle() + " " + prods[i].getPrix();
        }
        for (int i = 0; i < cmp_em; i++) {
            s += emps[i].toString();
        }
        return "Magasin{" + "identifiant=" + identifiant + ", nom=" + nom + ", adresse=" + adresse + "et les produits sont : " + s + '}';
    }

    public static Magasin comparerMagasin(Magasin m1, Magasin m2) {
        if (m1.cmp > m2.cmp) {
            return m1;
        }
        return m2;
    }

    public float sommeSalaireCaissier() {
        float somme = 0;
        for (int i = 0; i < this.cmp_em; i++) {
            if (emps[i] instanceof Caissier) {
                somme += emps[i].calculerSalaire();
            }
        }
        return somme;
    }

    public float sommePrimeResponsable() {
        float somme = 0;
        for (int i = 0; i < this.cmp_em; i++) {
            if (emps[i] instanceof Responsable) {
                somme += ((Responsable) emps[i]).getPrime();
            }
        }
        return somme;
    }

    public int nbrEmployeVendeur() {
        int nbr = 0;
        for (int i = 0; i < this.cmp_em; i++) {
            if (emps[i] instanceof Vendeur) {
                nbr++;
            }
        }
        return nbr;
    }

}
