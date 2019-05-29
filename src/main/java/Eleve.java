import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Eleve extends Personne  implements Comparable<Eleve> {
    protected Classe classe;
    private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
    private double moyenne;

    Eleve(String nom,String prenom,String nomDeClasse){
        super(nom,prenom);
        Classe c = Ecole.getClasse(nomDeClasse);
        if(c==null)
            c =new Classe(nomDeClasse);
        this.classe =c;
        this.classe.addEleve(this);
    }
    public double getMoyenne() {
        return moyenne;
    }

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListeNotes(ArrayList<Integer> listeNotes) {
        this.listeNotes = listeNotes;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    /* Une note inferieure a 0 sera considere comme egale a 0 ;
           une note superieure a 20 sera considere comme egale a 20 */
    public void ajouterNote(int note) {
        int nbNotes = this.listeNotes.size();
        if (note < 0) note = 0;
        else if (note > 20) note = 20;
        this.moyenne = (this.moyenne * nbNotes + note) / (nbNotes + 1);
        listeNotes.add(note);
    }
    @Override
    public String toString() {
        return super.toString() + ":   Moyenne: " + (int)(100 * moyenne)/100.0 + "\n";
    }
    public void setNotes() {
        String input = JOptionPane.showInputDialog("Saisir les notes de " + nom + "\nséparer par des virgules");
        Scanner s = new Scanner(input).useDelimiter(",");
        String strNote;
        while(s.hasNext()) {
            strNote = s.next().trim();
            ajouterNote(Integer.parseInt(strNote));
        }
        s.close();
    }
    @Override
    public int compareTo(Eleve autreEleve) {
        if (this.moyenne < autreEleve.moyenne) return -1;
        if (this.moyenne > autreEleve.moyenne) return 1;
        return 0;
    }

    public static void main(String[] arg) {
        Eleve eleve = new Eleve("Argoul","Pierre","B1");
        eleve.setNotes();
		/*
		for (int i = 1; i < arg.length; i++) {
			eleve.ajouterNote(Integer.parseInt(arg[i]));
			System.out.println("Moyenne de " + eleve.getNom() +
					" : " + eleve.getMoyenne());
		}
		*/
        System.out.println(eleve);
    }

}
