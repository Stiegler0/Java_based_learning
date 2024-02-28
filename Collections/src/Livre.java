import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
public class Livre {
    private String titre;
    private String auteur;

    public Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre(){
        return this.titre;
    }
    public String getAuteur(){
        return this.auteur;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }

    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    @Override
    public boolean equals(Object o){
        if ((o == null) || getClass() != o.getClass()){
            return false;
        }
        Livre livre = (Livre) o;
        return titre.equals(livre.titre) && auteur.equals(livre.auteur);
    }

    @Override
    public int hashCode(){
        return Objects.hash(titre,auteur);
   }

   public static void main(String[] args){
        Livre ob1 = new Livre("T1","A1");
        Livre ob2 = new Livre("T1","A1");

        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.hashCode());

        System.out.println(ob2.hashCode());

   }
}
