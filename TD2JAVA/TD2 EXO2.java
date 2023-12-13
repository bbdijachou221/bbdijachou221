public class Livre {
    private String auteur;
    private String titre;
    private int nbPages;

    public Livre(String auteur, String titre, int nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(int nbPages) {
        if (nbPages > 0) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Erreur : Le nombre de pages doit être un nombre positif.");
        }
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur1", "Titre1", 300);
        Livre livre2 = new Livre("Auteur2", "Titre2", 180);

        System.out.println("Nombre de pages du livre 1 : " + livre1.getNbPages());
        System.out.println("Nombre de pages du livre 2 : " + livre2.getNbPages());

        System.out.println("Affichage des nombres de pages : ");
        System.out.println("Livre 1 - Titre: " + livre1.getTitre() + ", Nombre de pages: " + livre1.getNbPages());
        System.out.println("Livre 2 - Titre: " + livre2.getTitre() + ", Nombre de pages: " + livre2.getNbPages());

        int nombreDePagesTotal = livre1.getNbPages() + livre2.getNbPages();
        System.out.println("Nombre total de pages des deux livres : " + nombreDePagesTotal);
    }
}
