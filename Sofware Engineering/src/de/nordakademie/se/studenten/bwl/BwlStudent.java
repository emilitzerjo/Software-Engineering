package de.nordakademie.se.studenten.bwl;

import de.nordakademie.se.framework.Student;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines BWL Studenten
 */
public class BwlStudent extends Student {

    //besondere Eigenschaft eines BWL Studenten
    private String golfplatz;

    /**
     * @param golfplatz
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
        return "BWL-Stundent vong Geld her = " + super.toString() + " Golfplatz: " + golfplatz;
    }

}
