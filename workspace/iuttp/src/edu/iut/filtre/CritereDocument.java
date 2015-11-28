package edu.iut.filtre;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.Document;
import edu.iut.app.ExamEvent;

public class CritereDocument implements Critere<Document>{

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Document type) {
		// TODO Auto-generated method stub
		List<ExamEvent> documentExams = new ArrayList<ExamEvent>();
		for (ExamEvent e : exams) {
			for (Document d : e.getDocuments()) {
				if (d.equals(type)) {
					documentExams.add(e);
				}
			}
		}
		return documentExams;
	}

}
