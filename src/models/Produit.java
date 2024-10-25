import java.util.Date;

public class Produit {

    private int id;
    private String libelle;
    private String marque;
    private Double prix;
    private Date dateExp;


    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }


    public Produit(int id, String libelle, String marque, Double prix) {
        this(id, libelle, marque);
        setPrix(prix);
    }
    public void setPrix(Double prix) {
        if (prix < 0) {
            throw new PrixNegatifException("Le prix ne peut pas être négatif.");
        }
        this.prix = prix;
    }

    public Double getPrix() {
        return prix;
    }

    public void afficherLibelle() {
        System.out.println("Libellé: " + this.libelle);
    }

    public boolean comparer(Produit produit) {
        return this.id == produit.id &&
                this.libelle.equals(produit.libelle) &&
                this.prix.equals(produit.prix);
    }

    public static boolean comparer(Produit produit1, Produit produit2) {
        return produit1.id == produit2.id &&
                produit1.libelle.equals(produit2.libelle) &&
                produit1.prix.equals(produit2.prix);
    }

    @Override
    public String toString() {
        return "Produit [ID: " + id +
                ", Libellé: " + libelle +
                ", Marque: " + marque +
                ", Prix: " + prix +
                ", Date d'expiration: " + dateExp + "]";
    }


    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }

    public Date getDateExp() {
        return dateExp;
    }
}
