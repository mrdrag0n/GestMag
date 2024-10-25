class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int produitCount;
    private Employe[] employes;
    private int employeCount;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.produitCount = 0;
        this.employes = new Employe[20];
        this.employeCount = 0;
    }

    public void ajouterProduit(Produit produit) throws MagasinPleinException {
        if (this.produitCount < this.capacite) {
            this.produits[this.produitCount++] = produit;
        } else {
            throw new MagasinPleinException("Capacité maximale atteinte, impossible d'ajouter plus de produits.");
        }
    }

    public void ajouterEmploye(Employe employe) {
        if (this.employeCount < 20) {
            this.employes[this.employeCount++] = employe;
        } else {
            System.out.println("Nombre maximum d'employés atteint.");
        }
    }

    public void afficherMagasin() {
        System.out.println("Magasin [ID: " + this.id + ", Adresse: " + this.adresse + "]");
        System.out.println("Produits du magasin:");

        for (int i = 0; i < this.produitCount; i++) {
            System.out.println(this.produits[i].toString());
        }

        System.out.println("Employés du magasin:");

        for (int i = 0; i < this.employeCount; i++) {
            System.out.println(this.employes[i].toString());
        }
    }

    public void afficherSalairesEmployes() {
        for (int i = 0; i < this.employeCount; i++) {
            String nom = this.employes[i].nom;
            System.out.println(nom + " a un salaire de: " + this.employes[i].calculerSalaire() + " DT");
        }
    }

    public void afficherPrimeResponsables() {
        for (int i = 0; i < this.employeCount; i++) {
            if (this.employes[i] instanceof Responsable) {
                String nom = this.employes[i].nom;
                System.out.println("Le responsable " + nom + " a une prime de: " + ((Responsable) this.employes[i]).prime + " DT");
            }
        }
    }
}
