package exo7;

import java.text.SimpleDateFormat;
import java.util.Date;

class Personne {
    private String nom;
    protected Date dateNaissance;
    protected double taille;

    public Personne(String nom, Date dateNaissance, double taille) {
        this.setNom(nom);
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }

    public Personne(String nom, Date dateNaissance) {
        this.setNom(nom);
        this.dateNaissance = dateNaissance;

    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + getNom() + '\'' +
                ", dateNaissance=" + new SimpleDateFormat("yyyy-MM-dd").format(dateNaissance) +
                ", taille=" + taille +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    protected void afficher() {
        this.afficher();
    }
}
