package de.nordakademie.se.studenten;

/**
 * @author Kevin Kehnen
 * <p>
 * Oberklasse für alle Studenten. Enthält die Stammdaten eines Studenten.
 */
public abstract class Student {

    private String name;
    private int jahrgang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }

    /**
     * @return Die formatierten Stammdaten des Studenten
     */
    protected String getStammdatenFormatiert(){
            return "Name: " + name + ", Jahrgang: " + jahrgang;
    }

    /**
     * Die konkrete Stringdarstellung ist von den Unterklassen zu implementieren.
     *
     * @return Stringdarstellung eines Studenten
     */
    @Override
    public abstract String toString();
}
