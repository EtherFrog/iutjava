package edu.iut.filter;

import java.util.List;

import edu.iut.app.ExamEvent;
/**
 * Filtre principale
 * Classe pour filtrer un examen
 * @param <Type>
 *@see ExamEvent
 */
public interface Criteria <Type> {
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Type type);
}
