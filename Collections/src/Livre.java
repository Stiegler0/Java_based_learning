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
}
