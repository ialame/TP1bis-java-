
import com.github.javafaker.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] str){
        Faker faker = new Faker(new Locale("fr"));
        String name = faker.name().fullName(); // Miss Samanta Schmidt
        Ecole estp =new Ecole("ESTP");
        Classe b1 = new Classe("B1");
        Professeur alame = new Professeur("Alame","Ibrahim","Informatique");
        Eleve e1 = new Eleve("Martin","Jean","B1");
        Eleve[] e = new Eleve[20];
        for(int i=0;i<20;i++){
            Random r = new Random();
            String firstName = faker.name().firstName(); // Emory
            String lastName = faker.name().lastName(); // Barton
            String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
            String ville = faker.address().city();
            e[i] = new Eleve(firstName,lastName,r.nextInt(2)==0?"B1":"TP1");
            e[i].setAdresse(streetAddress+", "+ville);

            for(int j=0;j<r.nextInt(10);j++)
                e[i].ajouterNote(5+r.nextInt(16));

        }
        Collections.sort(b1.getListeEleves()) ;
        System.out.println(estp);
    }
}
