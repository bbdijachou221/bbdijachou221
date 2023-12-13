public class Livre {
 
//Variables
private String titre,auteur;
private int nbPages;

//Constructeur
public Livre(String unAuteur,String unTitre){
auteur = unAuteur;
titre = unTitre;
}

//Accesseur
public String getAuteur(){
return auteur;
}

//Modificateur
void setNbPages(int n){
nbPages = n;
}


//Methode main
public static void main(String[] args) {
 Livre livre1 = new Livre("Auteur1", "Titre1");
 Livre livre2 = new Livre("Auteur2", "Titre2");
System.out.println("Auteur du livre1 : " + livre1.getAuteur());
System.out.println("Auteur du livre2 : " + livre2.getAuteur());
}
}