import java.util.ArrayList;

public class Classe {
    private String nom;
    private String professeur;
    private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
    Classe(String nom){
        this.nom =nom;
        Ecole.addClasse(this);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProfesseur() {
        return professeur;
    }

    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }

    public ArrayList<Eleve> getListeEleves() {
        return listeEleves;
    }

    public void setListeEleves(ArrayList<Eleve> listeEleves) {
        this.listeEleves = listeEleves;
    }

    public void addEleve(Eleve e){
        this.listeEleves.add(e);
    }
    public String toString(){
        String s ="\n--------------------\n" + nom+" :\n--------------------\n";
        for(Eleve e : listeEleves)
                s+= e +" :\n";

        return s;
    }
}
