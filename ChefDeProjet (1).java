
import java.util.List;

public class ChefDeProjet extends Personne {

    private int experience;
    private String specialisation;
    private double budgetTotal;
    private List<Employe> listEmployes;

    public ChefDeProjet(int id, String nom, String prenom, String email, int experience, String specialisation, double budgetTotal, List<Employe> listEmployes) {
        super(id, nom, prenom, email);
        this.experience = experience;
        this.specialisation = specialisation;
        this.budgetTotal = budgetTotal;
        this.listEmployes = listEmployes;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public double getBudgetTotal() {
        return budgetTotal;
    }

    public void setBudgetTotal(double budgetTotal) {
        this.budgetTotal = budgetTotal;
    }

    public List<Employe> getListEmployes() {
        return listEmployes;
    }

    public void setListEmployes(List<Employe> listEmployes) {
        this.listEmployes = listEmployes;
    }

    public void assignerTache(Employe employe, Tache tache) {
        if (employe != null && tache != null) {
            employe.effectuerTache(tache);
            System.out.println("Tâche assignée : " + tache.getDescription() + " à " + employe.getNom());
        }
    }

    @Override
    public void seConnecter() {
        System.out.println(getNom() + " s'est connecté en tant que Chef de Projet.");
    }

    @Override
    public void deconnecter() {
        System.out.println(getNom() + " s'est déconnecté.");
    }
}
