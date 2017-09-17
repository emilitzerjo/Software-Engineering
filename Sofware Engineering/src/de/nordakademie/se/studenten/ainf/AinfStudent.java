package de.nordakademie.se.studenten.ainf;

import de.nordakademie.se.framework.Student;

/**
 * @author Emil Militzer
 * <p>
 * Konkrete Implementierung eines Angewandten Informatikstudenten
 */
public class AinfStudent extends Student {

    //spezielle Eigenschaft eines Angewandten Informatikers
    private String programmiersprache;

    /**
     * @param programmiersprache Programmiersprache die er am besten kann
     */
    public AinfStudent(String programmiersprache) {
        super("angewandte Informatik");
        this.programmiersprache = programmiersprache;
    }

    public String getProgrammiersprache() {
        return programmiersprache;
    }

    public void setProgrammiersprache(String programmiersprache) {
        this.programmiersprache = programmiersprache;
    }

    @Override
    public String getSpezielleInfos() {
        return "Programmiersprache: " + programmiersprache;
    }
}
