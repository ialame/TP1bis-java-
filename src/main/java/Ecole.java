import java.util.ArrayList;

public class Ecole {
    private static String nom;
    private static ArrayList<Professeur> professeurs =new ArrayList<Professeur>();
    private static ArrayList<Classe> classes = new ArrayList<Classe>();
    Ecole(String nom){
        this.nom = nom;
    }
    public static void addProfesseur(Professeur p){
        professeurs.add(p);
    }
    public static void addClasse(Classe c){
        classes.add(c);
    }
    public static boolean hasClasse(String nom){
        for(Classe c : classes){
            if(c.getClass().equals(nom))
                return true;
        }
        return false;
    }
    public static Classe getClasse(String nom){
        for(Classe c : classes){
            if(c.getNom().equals(nom))
                return c;
        }
        return null;
    }
    public String toString(){
        String s="\n";
        for(Classe c : classes)
            s+=c;
        return s;

    }
}
