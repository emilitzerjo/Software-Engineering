package de.nordakademie.se.framework;

/**
 * @author Emil Militzer
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

    public abstract String getSpezielleInfos();

    public abstract  String getStudiengang();

}
