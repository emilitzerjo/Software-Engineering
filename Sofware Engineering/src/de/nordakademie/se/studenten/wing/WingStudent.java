package de.nordakademie.se.studenten.wing;

import de.nordakademie.se.framework.Student;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines Wing-Students
 */
public class WingStudent extends Student {

    //besondere Eigenschaften eines Wing-Studenten
    private String lieblingswerkzeug;
    private int praktikumsstunden;

    /**
     * Konstruktor für einen Wing-Studenten
     *
     * @param lieblingswerkzeug
     * @param praktikumsstunden
     */
    public WingStudent(String lieblingswerkzeug, int praktikumsstunden) {
        this.lieblingswerkzeug = lieblingswerkzeug;
        this.praktikumsstunden = praktikumsstunden;
    }

    public String getLieblingswerkzeug() {
        return lieblingswerkzeug;
    }

    public void setLieblingswerkzeug(String lieblingswerkzeug) {
        this.lieblingswerkzeug = lieblingswerkzeug;
    }

    public int getPraktikumsstunden() {
        return praktikumsstunden;
    }

    public void setPraktikumsstunden(int praktikumsstunden) {
        this.praktikumsstunden = praktikumsstunden;
    }

    @Override
    public String toString() {
        return "Wing-Student = " + super.toString() + " Lieblingswerkzeug: " + lieblingswerkzeug+" Praktikumsstunden: "+praktikumsstunden;
    }
}
