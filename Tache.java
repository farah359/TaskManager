public class Tache {

    private int id;
    private String description;/* chniya tache bidhbt */
    private int duree;
    private String statut; /* en cour wela termine son tache */
    private Personne responsable; /* personne ili bch yaml tache */

    public Tache(int id, String description, int duree, String statut) {
        this.id = id;
        this.description = description;
        this.duree = duree;
        this.statut = statut;
        this.responsable = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Personne getResponsable() {
        return responsable;
    }

    public void setResponsable(Personne responsable) {
        this.responsable = responsable;
    }

    public boolean assigneRes() {/* est ce que le responsable eu une tache oun no */
        return responsable != null;
    }

    public String calculerAvancement(int heuresEffectuees) {
        if (heuresEffectuees >= duree) {
            return "Tâche terminée à 100%";
        } else {
            int pourcentage = (heuresEffectuees * 100) / duree;
            return "Avancement : " + pourcentage + "%";
        }
    }

    public String toString() {
        return "Tâche [ID=" + id + ", Description='" + description + ", Durée=" + duree + " heures" + ", Statut="
                + statut + ", Responsable=" + responsable.getNom() + "]";
    }
}
