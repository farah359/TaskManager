
public class Time {

    private String dateDebut; // Format: YYYYMMDD
    private String dateFin;   // Format: YYYYMMDD
    private String duree;     // Durée exprimée en jours (stockée en String pour rester simple)

    // Constructeur
    public Time(String dateDebut, String dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.calculerDuree(); // Calcul automatique de la durée
    }

    // Getters et Setters
    public String getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
        this.calculerDuree(); // Recalcul automatique
    }

    public String getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
        this.calculerDuree(); // Recalcul automatique
    }

    public String getDuree() {
        return this.duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    // Méthode pour calculer la durée en jours (basée sur des chaînes formatées comme YYYYMMDD)
    public void calculerDuree() {
        try {
            int debut = Integer.parseInt(dateDebut);
            int fin = Integer.parseInt(dateFin);
            int dureeJours = fin - debut;

            // Gestion des cas d'erreur
            if (dureeJours < 0) {
                this.duree = "Erreur: dates invalides";
            } else {
                this.duree = dureeJours + " jours (approx)";
            }
        } catch (NumberFormatException e) {
            this.duree = "Erreur: format de date incorrect";
        }
    }

    // Méthode pour afficher les détails du temps
    public void afficherTemps() {
        System.out.println("Date de début : " + this.dateDebut);
        System.out.println("Date de fin : " + this.dateFin);
        System.out.println("Durée : " + this.duree);
    }
}
