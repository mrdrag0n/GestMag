
import java.util.Date;
abstract class Employe {


    public int id;
    public String nom;
    public String adresse;
    public int nbrHeures;

    public Employe(int id, String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }


    public abstract double calculerSalaire();

    public String toString() {
        return "Employé [ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse + ", Nbr heures: " + nbrHeures + "]";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && nom.equals(employe.nom) && adresse.equals(employe.adresse) && nbrHeures == employe.nbrHeures;
    }
}