abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String adresse;
    Personne(){ }
    Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString(){
        return nom+" "+prenom + (adresse==null?"":"("+adresse+")");
    }
}
