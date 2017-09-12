package de.nordakademie.se.ainf;

import de.nordakademie.se.framework.Student;

public class AinfStudent extends Student {

	private String programmiersprache;

	@Override
	public String toString() {
		return "AinfStudent = " + super.toString() + " Programmiersprache: "+programmiersprache;
	}

	public void setProgrammiersprache(String programmiersprache) {
		this.programmiersprache = programmiersprache;
	}

	public String getProgrammiersprache() {
		return programmiersprache;
	}

}
