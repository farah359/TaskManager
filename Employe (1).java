
import java.util.ArrayList;
import java.util.List;

public class Employe extends Personne {

    private String poste;
    private List<String> historiqueActions;

    public Employe(int id, String nom, String prenom, String email, String poste) {
        super(id, nom, prenom, email);
        this.poste = poste;
        this.historiqueActions = new ArrayList<>();
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public List<String> getHistoriqueActions() {
        return historiqueActions;
    }

    public void setHistoriqueActions(List<String> historiqueActions) {
        this.historiqueActions = historiqueActions;
    }

    @Override
    public void seConnecter() {
        System.out.println(getNom() + " s'est connecté en tant qu'Employé.");
        historiqueActions.add("Connexion réussie");
    }

    @Override
    public void deconnecter() {
        System.out.println(getNom() + " s'est déconnecté.");
        historiqueActions.add("Déconnexion");
    }

    public void effectuerTache(Tache tache) {
        System.out.println(getNom() + " effectue la tâche : " + tache.getDescription());
        historiqueActions.add("Tâche effectuée : " + tache.getDescription());
    }
}
