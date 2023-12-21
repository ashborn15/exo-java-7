import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private String nom;
    private Date dateNaissance;
    private double taille;

    // Constructeur pour initialiser les valeurs fictives
    public Main() {
        this.nom = "Grey FULLBUSTER";
        this.dateNaissance = new Date();
        this.taille = 189.0;
    }

    public void afficher() {
        System.out.println("Nom: " + getNom());
        System.out.println("Date de naissance: " + new SimpleDateFormat("yyyy-MM-dd").format(dateNaissance));
        System.out.println("Taille: " + taille);
    }

    private String getNom() {
        return nom;
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.afficher();
    }
}
