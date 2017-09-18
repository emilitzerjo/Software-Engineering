package de.nordakademie.se.studenten.konkretestudenten;

import de.nordakademie.se.studenten.Student;

/**
 * @author Paul Konopik
 * <p>
 * Konkrete Implementierung eines BWL Studenten
 */
public class BwlStudent extends Student {

    //spezielle Eigenschaft eines BWL Studenten
    private String golfplatz;

    /**
     * @param golfplatz Name des Lieblingsgolfplatzes
     */
    public BwlStudent(String golfplatz) {
        this.golfplatz = golfplatz;
    }

    public String getGolfplatz() {
        return golfplatz;
    }

    public void setGolfplatz(String golfplatz) {
        this.golfplatz = golfplatz;
    }

    @Override
    public String toString() {
        return "BWL-Student  = " + super.getStammdatenFormatiert() + ", Golfplatz: " + golfplatz;
    }

}
