public class Livre {
    private double prix;
    private boolean prixFixe;

    public Livre(double prix) {
        setPrix(prix);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double nouveauPrix) {
        if (!prixFixe) {
            prix = nouveauPrix;
            prixFixe = true;
            System.out.println("Prix fixé avec succès : " + prix);
        } else {
            System.out.println("Erreur : Le prix a déjà été fixé et ne peut pas être modifié.");
        }
    }

    public String toString() {
        if (prixFixe) {
            return "Livre avec un prix de " + prix;
        } else {
            return "Livre sans prix fixé encore";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Livre livreSansPrix = new Livre(0); 
        System.out.println("Description du livre sans prix : " + livreSansPrix);

        Livre livreAvecPrix = new Livre(40.5); 
        System.out.println("Description du livre avec prix : " + livreAvecPrix);

        livreAvecPrix.setPrix(30.0); 
    }
}
