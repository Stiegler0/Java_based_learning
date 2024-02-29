import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;
public class GestionnaireDeLivres {
    //private HashSet<Livre> collection = new HashSet<>();
    private HashSet<Livre> collection;
    public GestionnaireDeLivres(){
        collection = new HashSet<>();
    }

    public void AjouterLivre(Livre livre){
        if(collection.add(livre)){
            System.out.println("Livre ajouté");
        };
    }
    public void SupprimerLivre(Livre livre){
        collection.remove(livre);
    }

    public boolean contientLivre(Livre livre){
        return collection.contains(livre);
    }

    public void AfficherLivres(){
        Iterator<Livre> iter = collection.iterator();
        while (iter.hasNext()){
            Livre livre = iter.next();
            System.out.println(livre);
        }
    }

    public void TrouverLivreParAuteur(String auteur){
        Iterator<Livre> iter = collection.iterator();
        while (iter.hasNext()){
            Livre livre = iter.next();
            if (livre.getAuteur().equals(auteur)){
                System.out.println("Found: " + livre.getTitre());
            }else{
                System.out.println("Not found xD");
            }
        }
    }

//    public void TrouverLivreParAuteur(String auteur){
//        boolean found = false;
//        for (Livre livre : collection){
//            if(livre.getAuteur().equals(auteur)){
//                System.out.println("Found:"+ livre.getTitre());
//                found = true;
//            }
//        }
//        if(!found){
//            System.out.println("Not found");
//        }
//    }

}
