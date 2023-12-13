public class Livre {
    private String auteur;
    private String titre;
    private int nombreDePages;

    public Livre() {
    }

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    public Livre(String auteur, String titre, int nombreDePages) {
        this.auteur = auteur;
        this.titre = titre;
       this.nombreDePages = nombreDePages;
       
    }

    public void afficheToi() {
        System.out.println(toString());
    }

    public String toString() {
        return "Livre [Auteur=" + auteur + ", Titre=" + titre + ", Nombre de pages=" + nombreDePages + "]";
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Auteur1", "Titre1");
        Livre livre3 = new Livre("Auteur2", "Titre2", 300);

        System.out.println("Livre 1 : ");
        livre1.afficheToi();

        System.out.println("Livre 2 : ");
        livre2.afficheToi();

        System.out.println("Livre 3 : ");
        livre3.afficheToi();
    }
}
