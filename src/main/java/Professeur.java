public class Professeur extends Personne {
    protected String matiere;
    Professeur(String nom,String prenom, String matiere){
        super(nom,prenom);
        this.matiere = matiere;

    }


    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String toString(){
        return "Professeur "+ super.toString() + "matière : "+ matiere;
    }


}
