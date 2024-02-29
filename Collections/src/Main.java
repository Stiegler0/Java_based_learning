public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Livre liv1 = new Livre("Java","yassine");
        Livre liv2 = new Livre("Py","Yezz");
        Livre liv3 = liv1;


        GestionnaireDeLivres gest = new GestionnaireDeLivres();
        gest.AjouterLivre(liv1);
        gest.AjouterLivre(liv2);
        gest.AjouterLivre(liv3);// mat2ajoutach
        gest.SupprimerLivre(liv2);

        boolean cont = gest.contientLivre(liv2);
        System.out.println(cont);


        gest.AfficherLivres();

        gest.TrouverLivreParAuteur("yassine");
    }
}