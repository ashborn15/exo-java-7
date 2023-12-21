package exo7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Personne {

    private double salaire;
    private String poste;
    private static int nombreTotalEmployes = 0;

    public Employee(String nom, double salaire) {
        super(nom, new Date());
        this.salaire = salaire;
        nombreTotalEmployes++;
    }

    public Employee(String nom, Date dateNaissance, String poste) {
        super(nom, dateNaissance);
        this.poste = poste;
        nombreTotalEmployes++;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Salaire: " + salaire);
        System.out.println("Poste: " + poste);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nom='" + getNom() + '\'' +
                ", dateNaissance=" + new SimpleDateFormat("yyyy-MM-dd").format(getDateNaissance()) +
                ", salaire=" + salaire +
                ", poste='" + poste + '\'' +
                '}';
    }

    private Date getDateNaissance() {
        return null;
    }

    public static Employee creerEmployee(String nom, double salaire) {
        return new Employee(nom, salaire);
    }

    public static Employee creerEmployee(String nom, Date dateNaissance, String poste) {
        return new Employee(nom, dateNaissance, poste);
    }

    public static int getNombreTotalEmployes() {
        return nombreTotalEmployes;
    }
}
