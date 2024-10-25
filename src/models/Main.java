public class Main {
    public static void main(String[] args) {

        Magasin carrefour = new Magasin(1, "Carrefour", 2);
        Magasin monoprix = new Magasin(2, "Monoprix", 2);


        Caissier caissier1 = new Caissier(1, "Fawzi", "Rue A", 180, 10);
        Caissier caissier2 = new Caissier(2, "Ali", "Rue B", 200, 12);
        Vendeur vendeur1 = new Vendeur(3, "Walid", "Rue C", 160, 50);
        Responsable responsable1 = new Responsable(4, "Ferjeni", "Rue D", 170, 500);


        Caissier caissier3 = new Caissier(5, "Khaled", "Rue E", 190, 15);
        Vendeur vendeur2 = new Vendeur(6, "Sana", "Rue F", 160, 70);
        Vendeur vendeur3 = new Vendeur(7, "Mehdi", "Rue G", 150, 60);
        Responsable responsable2 = new Responsable(8, "Mouna", "Rue H", 180, 600);

        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(caissier2);
        carrefour.ajouterEmploye(vendeur1);
        carrefour.ajouterEmploye(responsable1);


        monoprix.ajouterEmploye(caissier3);
        monoprix.ajouterEmploye(vendeur2);
        monoprix.ajouterEmploye(vendeur3);
        monoprix.ajouterEmploye(responsable2);


        Produit produit1 = new Produit(101, "Lait", "Delice", 1.2);
        Produit produit2 = new Produit(102, "Yaourt", "Vitalait", 0.5);
        Produit produit3 = new Produit(103, "Tomate", "Sicam", 0.8);
        try {
            carrefour.ajouterProduit(produit1);
            carrefour.ajouterProduit(produit2);

            carrefour.ajouterProduit(produit3);
        } catch (MagasinPleinException e) {
            System.out.println(e.getMessage());
        }


        try {
            monoprix.ajouterProduit(produit3);
        } catch (MagasinPleinException e) {
            System.out.println(e.getMessage());
        }


        carrefour.afficherMagasin();
        monoprix.afficherMagasin();


        carrefour.afficherSalairesEmployes();
        monoprix.afficherSalairesEmployes();
        carrefour.afficherPrimeResponsables();
        monoprix.afficherPrimeResponsables();
    }
}
