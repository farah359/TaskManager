
import java.util.List;

public class Projet {

    private String idProjet;
    private String nomProjet;
    private ChefDeProjet chefDeProjet;
    private List<Tache> listeTaches;
    private List<Employe> listeEmployes;

    public Projet(String idProjet, String nomProjet, ChefDeProjet chefDeProjet, List<Tache> listeTaches, List<Employe> listeEmployes) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.chefDeProjet = chefDeProjet;
        this.listeTaches = listeTaches;
        this.listeEmployes = listeEmployes;
    }

    public String getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(String idProjet) {
        this.idProjet = idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public ChefDeProjet getChefDeProjet() {
        return chefDeProjet;
    }

    public void setChefDeProjet(ChefDeProjet chefDeProjet) {
        this.chefDeProjet = chefDeProjet;
    }

    public List<Tache> getListeTaches() {
        return listeTaches;
    }

    public void setListeTaches(List<Tache> listeTaches) {
        this.listeTaches = listeTaches;
    }

    public List<Employe> getListeEmployes() {
        return listeEmployes;
    }

    public void setListeEmployes(List<Employe> listeEmployes) {
        this.listeEmployes = listeEmployes;
    }

    public void ajouterTache(Tache tache) {
        this.listeTaches.add(tache);
        System.out.println("Tâche ajoutée : " + tache);
    }

    public void afficherListeEmployes() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    public void afficherListeTaches() {
        for (Tache tache : listeTaches) {
            System.out.println(tache);
        }
    }

    public void afficherDetailProjet() {
        System.out.println("ID Projet : " + idProjet);
        System.out.println("Nom Projet : " + nomProjet);
        System.out.println("Chef de Projet : " + chefDeProjet);
        System.out.println("Liste des Tâches :");
        afficherListeTaches();
        System.out.println("Liste des Employés :");
        afficherListeEmployes();
    }
}
