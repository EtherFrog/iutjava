package edu.iut.filter;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriteriaStudent implements Criteria<Person> {
	private String nom;
	private String prenom;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Person type) {
		// TODO Auto-generated method stub
		ArrayList<ExamEvent> exam = new ArrayList<ExamEvent>();

		for (ExamEvent e : exams) {
			if (e.getStudent().getFirstname() == prenom
					&& e.getStudent().getLastname() == nom)
				exam.add(e);
		}
		return exam;
	}
}
