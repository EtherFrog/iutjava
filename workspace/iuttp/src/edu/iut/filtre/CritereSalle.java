package edu.iut.filtre;

import java.util.ArrayList;
import java.util.List;
import edu.iut.app.Classroom;
import edu.iut.app.ExamEvent;

public class CritereSalle implements Critere<Classroom> {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Classroom salle) {
		// TODO Auto-generated method stub
		List<ExamEvent> salleExams = new ArrayList<ExamEvent>();
		for (ExamEvent e : exams) {
			if (e.getClassroom().equals(salle)) {
				salleExams.add(e);
			}
		}
		return salleExams;
	}

}
