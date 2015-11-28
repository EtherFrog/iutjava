package edu.iut.filtre;

import java.util.List;

import edu.iut.app.ExamEvent;

public interface Critere<type> {
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams,type type);
}
