package edu.iut.filtre;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriterePersonne implements Critere<Person> {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Person persons) {
		// TODO Auto-generated method stub
		List<ExamEvent> personExams = new ArrayList<ExamEvent>();
		for (ExamEvent e : exams) {
			for (Person p : e.getJury()) {
				if (p.equals(persons)) {
					personExams.add(e);
				}
			}
		}
		return personExams;
	}
}
