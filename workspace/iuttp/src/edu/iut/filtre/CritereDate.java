package edu.iut.filtre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.iut.app.ExamEvent;

public class CritereDate implements Critere<Date> {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Date date) {
		// TODO Auto-generated method stub
		List<ExamEvent> dateExams = new ArrayList<ExamEvent>();

		for (ExamEvent e : exams) {
			if (e.getExamDate().equals(date)) {
				dateExams.add(e);
			}
		}
		return dateExams;
	}

}
